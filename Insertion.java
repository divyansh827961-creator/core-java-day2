import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertion {

    public static void main(String[] args){
    
    String url = "jdc:mysql://location:3306/studentdb";
    String user = "root";
    String password = "root123";
    
    Scanner sc = new Scanner(System.in);
    
    try{
        Class.forName(className : "com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        
        System.out.println(s: "Enter ID: "); 
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println(s: "Enter Name: ");
        String name = sc.nextLine();
        
        System.out.println(s: "Enter Marks: ");
        int marks = sc.nextInt();

        String query = "INSERT INTO student VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(parameterIndex: 1, id);
        ps.setString(parameterIndex:2; name);      
        ps.setInt(parameterIndex:3, marks);

        int result = ps.executeUpdate();

        if(result > 0) {
            System.out.println("Record Inserted Successfully!");
        }else{
            System.out.println("Inserted Failed!");

            con.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


    

