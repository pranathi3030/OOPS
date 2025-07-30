
	public class Course {
	    int courseId;
	    String courseName;
	    String instructor;

	    // Default constructor chaining to parameterized constructor
	    public Course() {
	        this(0, "Undeclared", "TBD");
	    }

	    // Parameterized constructor
	    public Course(int courseId, String courseName, String instructor) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.instructor = instructor;
	    }

	    // Display method using this.variable
	    void displayCourse() {
	        System.out.println("Course ID   : " + this.courseId);
	        System.out.println("Course Name : " + this.courseName);
	        System.out.println("Instructor  : " + this.instructor);
	    }

	    public static void main(String[] args) {
	        Course c1 = new Course(); // Default constructor
	        Course c2 = new Course(201, "Java Programming", "Dr. Mehta");

	        c1.displayCourse();
	        System.out.println();
	        c2.displayCourse();
	    }
	}

