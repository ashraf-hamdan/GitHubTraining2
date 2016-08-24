package database.table;

/**
 * 
 * @author ashraf
 *
 */
public abstract class User {

	public static final String USER_TABLE = "user";

	public static final String USER_ID = "id";
	public static final String USER_NAME = "name";
	public static final String USER_PASSWORD = "password";
	public static final String USER_SALARY = "salary";

	public static final String USER_TABLE_CREATE = "CREATE TABLE " + USER_TABLE
			+ " ( " + USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ USER_NAME + " TEXT ," + USER_PASSWORD + " TEXT , " + USER_SALARY
			+ " TEXT)";

}
