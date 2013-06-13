package beans;

public class Change {
String opswd;
String pswd;
String omobile;
String mobile;
String oemail;
String pemail;
String uname;
public Change(){
	
}
public Change(String opswd,String pswd, String uname) {
	super();
	this.opswd=opswd;
	this.pswd = pswd;
	this.uname= uname;
}

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getOpswd() {
	return opswd;
}
public void setOpswd(String opswd) {
	this.opswd = opswd;
}
public String getPswd() {
	return pswd;
}
public void setPswd(String npswd) {
	this.pswd = pswd;
}
public String getOmobile() {
	return omobile;
}
public void setOmobile(String omobile) {
	this.omobile = omobile;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String pmobile) {
	this.mobile = mobile;
}
public String getOemail() {
	return oemail;
}
public void setOemail(String oemail) {
	this.oemail = oemail;
}
public String getPemail() {
	return pemail;
}
public void setPemail(String pemail) {
	this.pemail = pemail;
}


}
