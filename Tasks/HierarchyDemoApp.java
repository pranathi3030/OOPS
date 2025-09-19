package Tasks;


public class HierarchyDemoApp {
    public static void main(String[] args) {
        Person p1 = new Admin("Alice");
        Person p2 = new StudentRole("Bob");
        Person p3 = new Faculty("Charlie");

        p1.showRole();
        p2.showRole();
        p3.showRole();
    }
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println("I am a person named " + name);
    }
}

class Admin extends Person {
    public Admin(String name) { super(name); }

    @Override
    public void showRole() {
        System.out.println(name + " is an Admin who manages the system.");
    }
}

class StudentRole extends Person {
    public StudentRole(String name) { super(name); }

    @Override
    public void showRole() {
        System.out.println(name + " is a Student who attends courses.");
    }
}

class Faculty extends Person {
    public Faculty(String name) { super(name); }

    @Override
    public void showRole() {
        System.out.println(name + " is a Faculty who teaches subjects.");
    }
}
