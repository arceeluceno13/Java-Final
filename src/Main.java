import java.util.Scanner;

import classes.BillingMethod;
import classes.ComputerSpecs;
import classes.Premium;
import classes.Regular;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            System.out.println("********* WELCOME TO INTERNET CAFE SYSTEM ***************");
            System.out.println("* What type of user are you ?                            *");
            System.out.println("* 1. Regular                                             *");
            System.out.println("* 2. Premium                                             *");
            System.out.println("**********************************************************");
            System.out.print("Please pick a number: ");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("\n---* Personal Details *---");
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    scanner.nextLine();


                    String email;
                    while (true) {
                        System.out.print("Enter your Email: ");
                        email = scanner.nextLine();
                        if (email.contains("@")) {
                            break;
                        } else {
                            System.out.println("Invalid email format.");
                        }
                    }

                    boolean accstatus = false;
                    boolean isValidInput = false;

                    String contact_number;
                    while (true) {
                        System.out.print("Enter your ContactNumber (11 digits starting with 09): ");
                        contact_number = scanner.nextLine();

                        if (contact_number.matches("09\\d{9}") && contact_number.length() == 11) {
                            break;
                        } else {
                            System.out.println("Invalid input. ContactNumber should start with 09 followed by 9 digits (numbers only).");
                        }
                    }

                    while (!isValidInput) {
                        System.out.print("User is Active? (Y/N): ");
                        String input = scanner.nextLine().trim().toUpperCase();

                        if (input.equals("Y")) {
                            accstatus = true;
                            isValidInput = true;
                        } else if (input.equals("N")) {
                            accstatus = false;
                            isValidInput = true;
                        } else {
                            System.out.println("Invalid input. Please enter Y or N.");
                        }
                    }


                    int IDnumber;
                    while (true) {
                        System.out.print("Enter your IDnumber: ");
                        IDnumber = scanner.nextInt();
                        scanner.nextLine();
                        if (IDnumber > 0) {
                            break;
                        } else {
                            System.out.println("Please enter a positive number!");
                        }
                    }
                    System.out.println("-------------------------------------------------");
                    System.out.println("\n---* Billing Details *---\"");

                    int hours;
                    while(true) {
                        System.out.print("Enter your Time(Hours): ");
                        hours = scanner.nextInt();
                        if (hours > 0){
                            break;
                        } else {
                            System.out.println("Please enter a positive number!");
                        }
                    }

                    int balance;
                    while (true) {
                        System.out.print("Please enter your Amount Balance: ");
                        balance = scanner.nextInt();
                        if (balance >= 100) {
                            break;
                        } else {
                            System.out.println("Please enter balance not less than 100!");
                        }
                    }

                    System.out.println("Choose a payment method: ");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit Card");
                    System.out.print("Please Pick: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    String paymentMethod;
                    if (choice == 1) {
                        paymentMethod = "Cash";
                    } else if (choice == 2) {
                        paymentMethod = "Credit Card";
                    } else {
                        System.out.println("Invalid choice. Defaulting to Cash.");
                        paymentMethod = "Cash";
                    }

                    BillingMethod regbilling = new BillingMethod(paymentMethod);

                    while (true) {
                        System.out.print("Would you like to confirm payment? (Y/N): ");
                        String confirmation = scanner.nextLine();

                        if (confirmation.equalsIgnoreCase("Y")) {
                            regbilling.confirmPayment();
                            System.out.println("Payment confirmed!");
                            break;
                        } else if (confirmation.equalsIgnoreCase("N")) {
                            System.out.println("Payment not Confirmed! Thank you come again!");
                            System.exit(0);
                        } else {
                            System.out.println("Invalid input. Please enter 'Y' or 'N'.");

                        }
                    }

                    System.out.println("-------------------------------------------------");


                    Regular regularAccount = new Regular(name, contact_number, email, accstatus, IDnumber, hours, balance, "REGULAR", 40);
                    regularAccount.displayUserInfo();

                    regbilling.displayPaymentMethod();

                    ComputerSpecs Computer = new ComputerSpecs(50, true, true, "Nvision N200V8 20 LED Monitor", "RTX 3080 ti");
                    Computer.DisplaySpecs();

                    regularAccount.startCountdown(hours);
                    validInput = true;
                    break;

                case 2:
                    System.out.println("\n---* Personal Details *---");
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();
                    scanner.nextLine();



                    while (true) {
                        System.out.print("Enter your Email: ");
                        email = scanner.nextLine();
                        if (email.contains("@")) {
                            break;
                        } else {
                            System.out.println("Invalid email format.");
                        }
                    }

                    accstatus = false;
                    isValidInput = false;


                    while (true) {
                        System.out.print("Enter your ContactNumber (11 digits starting with 09): ");
                        contact_number = scanner.nextLine();

                        if (contact_number.matches("09\\d{9}") && contact_number.length() == 11) {
                            break;
                        } else {
                            System.out.println("Invalid input. ContactNumber should start with 09 followed by 9 digits (numbers only).");
                        }
                    }

                    while (!isValidInput) {
                        System.out.print("User is Active? (Y/N): ");
                        String input = scanner.nextLine().trim().toUpperCase();

                        if (input.equals("Y")) {
                            accstatus = true;
                            isValidInput = true;
                        } else if (input.equals("N")) {
                            accstatus = false;
                            isValidInput = true;
                        } else {
                            System.out.println("Invalid input. Please enter Y or N.");
                        }
                    }



                    while (true) {
                        System.out.print("Enter your IDnumber: ");
                        IDnumber = scanner.nextInt();
                        scanner.nextLine();
                        if (IDnumber > 0) {
                            break;
                        } else {
                            System.out.println("Please enter a positive number!");
                        }
                    }
                    System.out.println("-------------------------------------------------");
                    System.out.println("\n---* Billing Details *---\"");


                    while(true) {
                        System.out.print("Enter your Time(Hours): ");
                        hours = scanner.nextInt();
                        if (hours > 0){
                            break;
                        } else {
                            System.out.println("Please enter a positive number!");
                        }
                    }

                    while (true) {
                        System.out.print("Please enter your Amount Balance: ");
                        balance = scanner.nextInt();
                        if (balance >= 100) {
                            break;
                        } else {
                            System.out.println("Please enter balance not less than 100!");
                        }
                    }

                    System.out.println("Choose a payment method: ");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit Card");
                    System.out.print("Please Pick: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();


                    if (choice == 1) {
                        paymentMethod = "Cash";
                    } else if (choice == 2) {
                        paymentMethod = "Credit Card";
                    } else {
                        System.out.println("Invalid choice. Defaulting to Cash.");
                        paymentMethod = "Cash";
                    }

                    BillingMethod prembill = new BillingMethod(paymentMethod);

                    while (true) {
                        System.out.print("Would you like to confirm payment? (Y/N): ");
                        String confirmation = scanner.nextLine();

                        if (confirmation.equalsIgnoreCase("Y")) {
                            prembill.confirmPayment();
                            System.out.println("Payment confirmed!");
                            break;
                        } else if (confirmation.equalsIgnoreCase("N")) {
                            System.out.println("Payment not Confirmed! Thank you come again!");
                            System.exit(0);
                        } else {
                            System.out.println("Invalid input. Please enter 'Y' or 'N'.");

                        }


                    System.out.println("-------------------------------------------------");
                    }

                    Premium premiumAccount = new Premium(name, contact_number, email, accstatus, IDnumber, hours, 500, "PREMIUM", 30);
                    premiumAccount.displayUserInfo();

                    prembill.displayPaymentMethod();

                    ComputerSpecs ComputerPrem = new ComputerSpecs(100, true, true, "Acer Nitro VG240Y", "RTX 4090");
                    ComputerPrem.DisplaySpecs();

                    premiumAccount.startCountdown(hours);
                    validInput = true;
                    break;

                default:
                    System.out.println("Invalid Input please try again!.");
                    break;
            }
        }

        scanner.close();
    }
}

