import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CourseDBStructure implements CourseDBStructureInterface {
	 LinkedList<CourseDBElement>[] hashTable;
	private int tableSize;
	
	public CourseDBStructure() {
		this.tableSize = 1000;
		hashTable = new LinkedList[tableSize];
	}
	
	public CourseDBStructure(int tableSize) {
		this.tableSize = tableSize;
		hashTable = new LinkedList[tableSize];
	}
	
	public CourseDBStructure(String Test, int tableSize) {
		this.tableSize = tableSize;
		hashTable = new LinkedList[tableSize];
	}

	@Override
	public void add(CourseDBElement element) {
		int index = element.hashCode() % getTableSize();
		if (hashTable[index] != null) {
			int g = 0;
			Iterator listIt = hashTable[index].iterator();
			while(listIt.hasNext()){
				if (element.hashCode() == hashTable[index].get(g).hashCode()) {
					
				}
			}
			hashTable[index].add(element);
		}
		else {
			hashTable[index] = new LinkedList<CourseDBElement>();
			hashTable[index].add(element);
		}
		
		
		
		
	}

	@Override
	public CourseDBElement get(int crn) throws IOException {
			for (int i = 0; i < hashTable.length; i++) {
				if (hashTable[i] != null) {
				for (int j = 0; j < hashTable[i].size(); j++) {
					if(crn == hashTable[i].get(j).getCRN())
						return hashTable[i].get(j);
						
					}	
				}
				else {
					throw new IOException();
				}
			}
			return null;
	}
	
	public ArrayList<String> showAll(){
		ArrayList<String> list = new ArrayList<String>();
		for (int i= 0; i < getTableSize(); i++) {
			while(hashTable[i] != null) {
				for (int j = 0; j < hashTable[i].size(); j++) {
					CourseDBElement e = (CourseDBElement)hashTable[i].get(j);
					list.add("\n"+ e.toString());
				}
				break;
			}
		}
		return list;
	}
	

	@Override
	public int getTableSize() {
		
		return tableSize;
	}

}
