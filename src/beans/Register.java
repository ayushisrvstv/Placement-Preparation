package beans;

public class Register {
	String uname;
	String name;
	String pswd;
	String cpswd;
	String mobile;
	String college;
	String branch;
	String mail;
	int id;
	
	
	public Register(String uname, String name, String pswd, String cpswd,
			String mobile, String college, String branch, String mail) {
		super();
		this.uname = uname;
		this.name = name;
		this.pswd = pswd;
		this.cpswd = cpswd;
		this.mobile = mobile;
		this.branch = branch;
		this.college = college;
		this.mail = mail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getCpswd() {
		return cpswd;
	}
	public void setCpswd(String cpswd) {
		this.cpswd = cpswd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
