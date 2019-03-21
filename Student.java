
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NipunPC
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses;
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the firstname of the student ");
        this.firstName = scanner.nextLine();
        System.out.print("enter the secondname of the student ");
        this.firstName = scanner.nextLine();
        System.out.print("1 for grade1\n 2 for grade2\n 3 for grade3\n");
        this.gradeYear = scanner.nextLine();
        
        this.studentId = setStudentId();
        
    }
    private String setStudentId(){
        id = id+1;
        return gradeYear + "" + id;
    }
    
}
