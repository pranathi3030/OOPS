
	class Person {
	    String name;

	    Person(String name) {
	        this.name = name;
	    }

	    void showDetails() {
	        System.out.println("Name (Person): " + name);
	    }
	}

	class Student extends Person {
	    int rollNo;

	    Student(String name, int rollNo) {
	        super(name); // Call parent constructor
	        this.rollNo = rollNo;
	    }

	    void showStudentDetails() {
	        super.showDetails(); // Call parent method
	        System.out.println("Roll No       : " + rollNo);
	    }

	    public static void main(String[] args) {
	        Student s = new Student("Meera", 105);
	        s.showStudentDetails();
	    }
	}

