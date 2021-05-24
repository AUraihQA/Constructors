package PersonOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
		private String Name;
		private int Age;
		private String JobTitle;
		
		private List<Person> myList = new ArrayList<>();
			
		public Person(String name, int age, String jobTitle) {
			super();
			Name = name;
			Age = age;
			JobTitle = jobTitle;
			
			
		}
		
		public Person() {
			
		}
		
		


		@Override
		public String toString() {
			return "Person [Name=" + Name + ", Age=" + Age + ", JobTitle=" + JobTitle + "]";
		}


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public int getAge() {
			return Age;
		}


		public void setAge(int age) {
			Age = age;
		}


		public String getJobTitle() {
			return JobTitle;
		}


		public void setJobTitle(String jobTitle) {
			JobTitle = jobTitle;
		}
		
		public void addPerson (Person p) {
			myList.add(p);
		}
		
		private Person findByName(String name) {
			for(Person p : myList) {
				if (p.getName().equals(name)) {
					System.out.println("Person with name: " + p.toString());
					return p;
				}
			}
			return null;
			}
		
		public void readAll() {
			myList.stream().forEach(x -> System.out.println(x));
		}
		
		public void scan() {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Enter the name of the person you want find");;
				String p2Find = sc.nextLine();
				findByName(p2Find);
				System.out.println("To exit type 'q'");	
			} while (!sc.nextLine().equals("q"));
			
			}
		
}
			



