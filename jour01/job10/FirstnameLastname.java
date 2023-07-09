import java.util.Scanner;

public class FirstnameLastname {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String firstname;
        String lastname;
        
        System.out.println("Enter your firstname :");
        firstname = myObj.nextLine();

        System.out.println("Enter your lastname :");
        lastname = myObj.nextLine();
        
        System.out.println("Firstname : " + firstname);
        System.out.println("Lastname : " + lastname);

        myObj.close();
    }
}