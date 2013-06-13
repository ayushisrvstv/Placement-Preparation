package beans;

public class AddCompany {
String cname;
String addr1;
String addr2;

public AddCompany() {

}
public AddCompany(String cname, String addr1, String addr2) {
	super();
	this.cname = cname;
	this.addr1 = addr1;
	this.addr2 = addr2;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getAddr1() {
	return addr1;
}
public void setAddr1(String addr1) {
	this.addr1 = addr1;
}
public String getAddr2() {
	return addr2;
}
public void setAddr2(String addr2) {
	this.addr2 = addr2;
}


}
