import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 8;

    //Constructor to receive first and last name

    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created : " + firstName + " " + lastName );


        //Call method asking to set department
        this.department = setDepartment();
        System.out.println("Department : " + department);

    //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your passoword is " + password);

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

    private String randomPassword(int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[lenght];
        for (int i=0; i < lenght; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set Mailbox Capacity

    //Set alternate email

    //Change Password



}




