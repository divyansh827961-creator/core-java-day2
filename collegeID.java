public class CollegeID {

    // Instance variables (properties of a student)
    int rollno;     // stores roll number
    String name;    // stores student name
    double marks;   // stores marks

    // Method to display student details
    void displayDetails() {

        // Printing all student details
        System.out.println("Roll no is : " + rollno);
        System.out.println("Name is : " + name);
        System.out.println("Marks is : " + marks);
    }

    public static void main(String[] args) {

        // Creating object of CollegeID class
        CollegeID s1 = new CollegeID();

        // Assigning values to instance variables using object
        s1.rollno = 43;
        s1.name = "Amrit";
        s1.marks = 89;

        // Calling method to display details
        s1.displayDetails();
    }
}