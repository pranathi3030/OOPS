public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78};
        Learner learner1 = new Learner("Anita", 101, marks);

        learner1.displayInfo();

        learner1.setName("Anita Sharma");
        learner1.setRollNumber(202);

        System.out.println("\nAfter updating:");
        learner1.displayInfo();
    }
}

