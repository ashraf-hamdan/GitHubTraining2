package database.entitys;

/**
 * 
 * @author ashraf
 * 
 */
public class UserEntity {
	private int id;
	private String name;
	private String passWord;
	private String salry;

	public UserEntity(int id, String name, String passWord, String salry) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
		this.salry = salry;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSalry() {
		return salry;
	}

	public void setSalry(String salry) {
		this.salry = salry;
	}

}
