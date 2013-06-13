package beans;

public class AddI {
	String ques;
	String cname;
	String uname;
	
	
	public AddI() {
		super();
	}

	public AddI(String ques, String cname) {
		super();
		this.ques = ques;
		this.cname = cname;
		
	}
	
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	
	
	

}
