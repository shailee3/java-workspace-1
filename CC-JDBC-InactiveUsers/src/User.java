
public class User {
	private Integer id;
	private String username;
	private String password;
	private String address;
	private String mobile_number;
	private Integer deleted;
	
	public User(Integer id, String username, String password, String address,
			String mobile_number, Integer deleted) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobile_number = mobile_number;
		this.deleted = deleted;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return password;
	}
	public void setPasssword(String passsword) {
		this.password = passsword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}
