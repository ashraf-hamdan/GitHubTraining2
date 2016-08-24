package database;

import database.table.Outlay;
import database.table.User;
import android.content.ContentValues;
import android.content.Context;
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

}
