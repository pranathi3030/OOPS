
	public class College {
    static String universityName;
    int collegeCode;
    String collegeName;

    // Static block initializes shared university name
    static {
        universityName = "Global Tech University";
    }

    // Static method to change university name
    static void updateUniversityName(String newName) {
        universityName = newName;
    }

    // Constructor to initialize college-specific details
    public College(int code, String name) {
        collegeCode = code;
        collegeName = name;
    }

    // Instance method to display college details
    void displayDetails() {
        System.out.println("University : " + universityName);
        System.out.println("College Code: " + collegeCode);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        College c1 = new College(101, "Bright Minds College");
        College c2 = new College(102, "Innovators Institute");

        c1.displayDetails();
        System.out.println();
        c2.displayDetails();

        System.out.println("\n-- Updating University Name --");
        College.updateUniversityName("TechVerse University");

        c1.displayDetails();
        System.out.println();
        c2.displayDetails();
    }
}

