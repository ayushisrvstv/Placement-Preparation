package beans;

public class ChangeEM {
	String uname;
	String oemail;
	String mail;
	
	public ChangeEM(String uname, String oemail, String mail) {
		super();
		this.uname = uname;
		this.oemail = oemail;
		this.mail = mail;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
