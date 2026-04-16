// Parent class
public class StudentParent {
    
    // Parent class properties
    int rollNo = 43;
    String name = "Amrit";

    // Parent class method
    void showStudentDetails() {
        System.out.println("Roll no : " + rollNo);
        System.out.println("Name is : " + name);
    }
}

// Child class inherits parent class
class CollegeStudent extends StudentParent {

    // Child class property
    String collegeName = "ABCD";

    // Overriding parent method
    void showStudentDetails() {
        
        // Call parent method using super
        super.showStudentDetails();
        
        // Add child-specific details
        System.out.println("College name is : " + collegeName);
    }
}

// Main class
class MainApp {
    public static void main(String[] args) {
        
        // Create object of child class
        CollegeStudent cs = new CollegeStudent();

        // Call overridden method
        cs.showStudentDetails();
    }
}