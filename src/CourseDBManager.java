import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDBManager implements CourseDBManagerInterface {
	CourseDBStructure db = new CourseDBStructure();
	@Override
	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		CourseDBElement element = new CourseDBElement(id, crn, credits, roomNum, instructor); 
		db.add(element);
		
		
	}

	@Override
	public CourseDBElement get(int crn) {
		try {
			db.get(crn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void readFile(File input) throws FileNotFoundException {
		Scanner in=new Scanner(input);
		int cred,crn;
		CourseDBElement element;
		String courses;
		String[] course;
		while (in.hasNextLine()) {
			courses=in.nextLine();
			course=courses.split(" ",5);
			crn=Integer.parseInt(course[1]);
			cred=Integer.parseInt(course[2]);
			element=new CourseDBElement(course[0],crn,cred,course[3],course[4]);
			db.add(element);
		}
		in.close();
		
	}
		
		

	@Override
	public ArrayList<String> showAll() {
		
		return db.showAll();
	}

}
