package beans;

public class Login {
	static String uname;
	String pswd;
	
	
	
	public Login(String uname, String pswd) {
		super();
		this.uname = uname;
		this.pswd = pswd;
			}

	public static String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

}
