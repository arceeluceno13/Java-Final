package classes;

public class UserAccount {
    protected String name;
    protected String contact_number;
    protected String email;
    protected boolean accstatus;
    protected int IDnumber;

    public UserAccount(String name, String contact_number, String email, boolean accstatus, int IDnumber) {
        this.name = name;
        this.contact_number = contact_number;
        this.email = email;
        this.accstatus = accstatus;
        this.IDnumber = IDnumber;
    }

    public void displayUserInfo() {
        System.out.println("\n\n###INFO###");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone#: " + contact_number);
        System.out.println("ID_number: " + IDnumber);
        System.out.println("Account Status: " + (accstatus ? "Active" : "Inactive"));
        System.out.println("##############################\n");
    }
}
