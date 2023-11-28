import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first and last name

    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created : " + firstName + " " + lastName );


        //Call method asking to set department
        this.department = setDepartment();
        System.out.println("Department : " + department);
    }

    //Ask for department

    private String setDepartment() {
        System.out.print("Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department : ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if(depChoice == 1) {return "Sales";}
    else if (depChoice == 2) {return "dev";}
    else if (depChoice == 3) {return "acct";}
        else {return " ";}

    }

    //Generate Random Password

    //Set Mailbox Capacity

    //Set alternate email

    //Change Password



}




