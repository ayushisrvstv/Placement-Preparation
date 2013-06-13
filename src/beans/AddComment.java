package beans;

public class AddComment {
	String uname;
	String cmnt;
	String cname;
	String ques;
	
	public AddComment() {
		super();
	}

	public AddComment(String uname, String cmnt,String cname, String ques) {
		super();
		this.uname = uname;
		this.cmnt = cmnt;
		this.cname=cname;
		this.ques=ques;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCmnt() {
		return cmnt;
	}

	public void setCmnt(String cmnt) {
		this.cmnt = cmnt;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}



}
