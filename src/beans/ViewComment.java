package beans;

public class ViewComment {
	
	String cname,ques,cmnt,addCmnt;
	
	
	
	
public ViewComment() {
		super();
	}

public ViewComment(String cname, String ques, String cmnt, String addCmnt) {
		super();
		this.cname = cname;
		this.ques = ques;
		this.cmnt = cmnt;
		this.addCmnt = addCmnt;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getCmnt() {
		return cmnt;
	}

	public void setCmnt(String cmnt) {
		this.cmnt = cmnt;
	}

	public String getAddCmnt() {
		return addCmnt;
	}

	public void setAddCmnt(String addCmnt) {
		this.addCmnt = addCmnt;
	}


}
