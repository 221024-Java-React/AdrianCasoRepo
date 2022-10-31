package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab11 {
	
	
	public static void main(String[] args) {
		
		Lab11 app = new Lab11();
		
		Person person1 = new Person("Chet", "Steadman", 78);
		Person person2 = new Person("Kenny", "Chesney", 23);
		Person person3 = new Person("Miles", "Standish", 34);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		
		
		app.iteratorFun(personList);
//		System.out.println(app.nameList(personList));
		
	}
	
	public List<String> nameList(List<Person> pList) { 
		List<String> retList = new ArrayList<String>();
		
		for(Person p : pList) {
			retList.add(p.getFirst());
		}
		
		return retList;
	}
	
	public void iteratorFun(List<Person> pList) {
		ListIterator<Person> it = pList.listIterator();
				
		int oldest = 0;
		String oldestName = null;
		
		while(it.hasNext()) {
			Person check = it.next();
			
			
			if(check.getAge() > oldest) {
				oldest = check.getAge();
				oldestName = check.getFirst();

			}
		}
		
		
		System.out.println(oldestName);
		
		
		
		
	}

}
