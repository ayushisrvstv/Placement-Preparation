package beans;

public class AddW {
String ques;
String opA;
String opB;
String opC;
String opD;
String ans;
String cname;

public AddW(){

}
public AddW(String ques, String opA, String opB, String opC, String opD, String ans, String cname) {
	super();
	this.ques = ques;
	this.opA = opA;
	this.opB = opB;
	this.opC = opC;
	this.opD = opD;
	this.ans= ans;
	this.cname=cname;
	
}


public String getCname() {
	return cname;
}


public void setCname(String cname) {
	this.cname = cname;
}


public String getAns() {
	return ans;
}


public void setAns(String ans) {
	this.ans = ans;
}


public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}
public String getOpA() {
	return opA;
}
public void setOpA(String opA) {
	this.opA = opA;
}
public String getOpB() {
	return opB;
}
public void setOpB(String opB) {
	this.opB = opB;
}
public String getOpC() {
	return opC;
}
public void setOpC(String opC) {
	this.opC = opC;
}
public String getOpD() {
	return opD;
}
public void setOpD(String opD) {
	this.opD = opD;
}

}
