package beans;

public class SelectCompany {
	 static String company;
	 String ques;
	 
	 public SelectCompany(){

		}

		public SelectCompany(String company) {
			super();
			SelectCompany.company =company;
				}


	public String getQues() {
			return ques;
		}

		public void setQues(String ques) {
			this.ques = ques;
		}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		SelectCompany.company = company;
	}
	 

			

}
