package database;

import database.table.Outlay;
import database.table.User;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 
 * @author ashraf
 * 
 */
public class DatabaseHelper extends SQLiteOpenHelper {
	public final static String DATABASE_NAME = "sm.db";
	public final static int DATABASE_VERSION = 1;

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(User.USER_TABLE_CREATE);
		db.execSQL(Outlay.OUTLAY_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + User.USER_TABLE);
		db.execSQL("DROP TABLE IF EXISTS " + Outlay.OUTLAY_TABLE);
		onCreate(db);
	}

	/**
	 * this method get three @param name password salary to add new User and it
	 * return user ID after add he but if any not add the method return -1
	 * @return user id  if Success and -1 if fail 
	 */
	public long insertUser(String name, String password, Integer salary) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues content = new ContentValues();
		content.put(User.USER_NAME, name);
		content.put(User.USER_PASSWORD, password);
		content.put(User.USER_SALARY, salary);

		long userId = db.insert(User.USER_TABLE, null, content);

		return userId;
	}

	/**
	 * this method get four @param userId name value date to add new outlay and
	 * it return outlay ID after add it but if any not add the method return -1
	 * @return Outlay id if Success and -1 if fail 
	 */
	public long insertOutlay(long userID, String name, String value, String date) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues content = new ContentValues();
		content.put(Outlay.OUTLAY_USER_ID, userID);
		content.put(Outlay.OUTLAY_NAME, name);
		content.put(Outlay.OUTLAY_VALUE, value);
		content.put(Outlay.OUTLAY_DATE, date);

		long outlayId = db.insert(Outlay.OUTLAY_TABLE, null, content);

		return outlayId;
	}

	/**
	 * this Method to get All Outlay in database Regardless of the user .
	 * 
	 * @return All Outlay in system
	 */
	public Cursor getAllOutaly() {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.query(Outlay.OUTLAY_TABLE, new String[] {
				Outlay.OUTLAY_NAME, Outlay.OUTLAY_VALUE, Outlay.OUTLAY_DATE,
				Outlay.OUTLAY_USER_ID }, null, null, null, null, null);
		return cursor;
	}

	/**
	 * this method get one @param it user id and @return all outlay related
	 * to this user
	 * 
	 * @return all Outlay to this User
	 * 
	 */
	public Cursor getAllOutalyByUserID(String userID) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.query(Outlay.OUTLAY_TABLE, new String[] {
				Outlay.OUTLAY_NAME, Outlay.OUTLAY_VALUE, Outlay.OUTLAY_DATE,
				Outlay.OUTLAY_USER_ID }, Outlay.OUTLAY_USER_ID + "= ?",
				new String[] { userID }, null, null, null);
		return cursor;
	}

	/**
	 * this method get tow @param it outlay Date and user id and @return All
	 * outlay to this user in this date
	 * @return  all Outlay to this User in this date
	 */
	public Cursor getAllOutlayInSpiseficDate(String outlayDate, String userID) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.query(Outlay.OUTLAY_TABLE, new String[] {
				Outlay.OUTLAY_NAME, Outlay.OUTLAY_VALUE, Outlay.OUTLAY_DATE,
				Outlay.OUTLAY_USER_ID }, Outlay.OUTLAY_DATE + "= ? AND "
				+ Outlay.OUTLAY_USER_ID + " = ? ", new String[] { outlayDate,
				userID }, null, null, null);
		return cursor;
	}

	/**
	 * this method  cheek if the user valid or not after that it
	 * @param username
	 * @param password
	 *  
	 * @return a true if  he valid or false  if he not valid
	 */
	public boolean Login(String username, String password) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery("SELECT * FROM " + User.USER_TABLE
				+ " WHERE " + User.USER_NAME + " = ? AND " + User.USER_PASSWORD
				+ " = ?", new String[] { username, password });
		if (cursor != null) {
			if (cursor.getCount() > 0) {
				return true;
			}
		}
		return false;
	}

}
