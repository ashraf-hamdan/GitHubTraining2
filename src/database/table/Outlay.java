package database.table;
/**
 * 
 * @author ashraf
 *
 */
public abstract class Outlay {

	public static final String OUTLAY_TABLE = "outlay";

	public static final String OUTLAY_ID = "id";
	public static final String OUTLAY_USER_ID = "user_id";
	public static final String OUTLAY_NAME = "name";
	public static final String OUTLAY_VALUE = "value";
	public static final String OUTLAY_DATE = "get_date";

	public static final String OUTLAY_TABLE_CREATE = "CREATE TABLE " + OUTLAY_TABLE
			+ " ( " + OUTLAY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ OUTLAY_USER_ID + " INTEGER NOT NULL ," + OUTLAY_NAME + " TEXT , " + OUTLAY_VALUE
			+ " TEXT , "+OUTLAY_DATE+" TEXT )";
}
