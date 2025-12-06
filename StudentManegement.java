
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManegement {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         ArrayList<String> students = new ArrayList<>();
         int choice;

         do {
            System.out.println("\n== Student Management System ==");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.Show Students");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = sc .nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    System.out.println("Enter Student name: ");
                    String name =   sc.nextLine();
                    students.add(name);
                    System.out.println(name +" added successfully");
                    break;

               case 2 :
                System.out.println("Enter student name to remove :");
                String removeName = sc.nextLine();
                if (students.remove(removeName)){
                        System.out.println(removeName +"removed sucdessfully");
                }     
                else {
                    System.out.println("student not found");
                }
                break;

                case 3 :
                    System.out.println("\n--- Student List ---");
                    if(students.isEmpty()){
                        System.out.println("No Student found.");
                    } else {
                        for (String s : students){
                            System.out.println(s);
                        }
                    }
                    break;

                case 4 :
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("Invalid choice. Please tey again.");        
            }
         }
         while (choice != 4);

     }   
     
}