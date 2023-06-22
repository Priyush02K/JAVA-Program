import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Entre The Name"); 

        String First_Name =sc.next();
        System.out.println("Entre The last Name"); 

        String Last_Name =sc.next();
        int Roll_Number=sc.nextInt();
        String Field_of_interest =sc.next();

            System.out.println("Name: " + First_Name +" "+Last_Name); 
            System.out.println("Roll Number: " +Roll_Number);
            System.out.println("Fiels of Interest : " +Field_of_interest);




        }    
}
