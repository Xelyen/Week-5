package Notes;

public class Classes {

	public static void main(String[] args) {
		
		// *Class*  *Object*  *Instance of StringBuilder class*
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		//Method from Student
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-4567";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "904-320-9876", 11);
		student3.introduce();

	}

}
