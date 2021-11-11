
public class CourseDBElement implements Comparable{
	private String courseID;
	private int CRN;
	private int credits;
	private String roomNum;
	private String instructorName;
	
	public CourseDBElement() {
		this.courseID = "";
		this.CRN = 0;
		this.credits = 0;
		this.roomNum = "";
		this.instructorName = "";
	}
	
	public CourseDBElement(String id, int crn, int credits, String roomNo, String instructorName) {
		this.courseID = id;
		this.CRN = crn;
		this.credits = credits;
		this.roomNum = roomNo;
		this.instructorName = instructorName;
	}
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	public String getCourseID() {
		return courseID;
	}



	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}



	public int getCRN() {
		return CRN;
	}



	public void setCRN(int cRN) {
		CRN = cRN;
	}



	public int getCredits() {
		return credits;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	public String getRoomNum() {
		return roomNum;
	}



	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}



	public String getInstructorName() {
		return instructorName;
	}



	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public int hashcode() {
		return Integer.toString(CRN).hashCode();
	}
	
	public String toString() {
		return "Course:" + courseID + " CRN:" + CRN + " Credits:" + credits + " Instructor:" + instructorName + " Room:" + roomNum; 
	}

}
