package database.entitys;

/**
 * 
 * @author ashraf
 *
 */
public class OutlayEntity {
	private int id;
	private int userId;
	private String name;
	private String value;
	private String date;
	
	public OutlayEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OutlayEntity(int id, int userId, String name, String value,
			String date) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.value = value;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
