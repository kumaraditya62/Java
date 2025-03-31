
class Student {
    String name;
    int roll;

    // Constructor to initialize fields
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void Show() {
        System.out.println("Hello, I am " + name);
        System.out.println("My Roll Number Is: " + roll);
    }
}

class Demo {
    public static void main(String arg[]) {
        // Create a Student object with name and roll number
        Student S = new Student("John", 123);
        
        // Display hash code of the object
        System.out.println("Hash Code: " + S.hashCode());
        
        // Call the Show() method
        S.Show();
    }
}
