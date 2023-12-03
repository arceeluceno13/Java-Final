import java.util.Scanner;

import classes.BillingMethod;
import classes.ComputerSpecs;
import classes.Premium;
import classes.Regular;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.print("Pick a number: ");
        int type = scanner.nextInt();
        switch (type) {
            case 1:
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

                while (!isValidInput) {
                    System.out.print("ACTIVE (Y/N): ");
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

                int IDnumber;
                while (true) {
                    System.out.print("Enter your IDnumber: ");
                    IDnumber = scanner.nextInt();
                    scanner.nextLine();
                    if (IDnumber > 0) {
                        break;
                    } else {
                        System.out.println("Please enter a positive number: ");
                    }
                }

                int balance;
                while (true) {
                    System.out.println("Enter your Balance: ");
                    balance = scanner.nextInt();
                    if (balance >= 100) {
                        break;
                    } else {
                        System.out.println("Please enter balance not less than 100!");
                    }
                }

                System.out.println("Enter your Time(Hours): ");
                int hours = scanner.nextInt();

                System.out.println("Choose a payment method: ");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
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
                    System.out.println("Would you like to confirm payment? (Y/N): ");
                    String confirmation = scanner.nextLine();

                    if (confirmation.equalsIgnoreCase("Y")) {
                        regbilling.confirmPayment();
                        System.out.println("Payment confirmed!");
                        break;
                    } else if (confirmation.equalsIgnoreCase("N")) {
                        System.out.println("Payment not Confirmed! Please try again.");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input. Please enter 'Y' or 'N'.");

                    }
                }


                Regular regularAccount = new Regular(name, contact_number, email, accstatus, IDnumber, hours, balance, "REGULAR", 40);
                regularAccount.displayUserInfo();

                regbilling.displayPaymentMethod();

                ComputerSpecs Computer = new ComputerSpecs(50, true, true, "Nvision N200V8 20 LED Monitor", "RTX 3080 ti");
                Computer.DisplaySpecs();

                regularAccount.startCountdown(hours);

                break;

            case 2:
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

                while (!isValidInput) {
                    System.out.print("ACTIVE (Y/N): ");
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
                    System.out.print("Enter your ContactNumber (11 digits starting with 09): ");
                    contact_number = scanner.nextLine();

                    if (contact_number.matches("09\\d{9}") && contact_number.length() == 11) {
                        break;
                    } else {
                        System.out.println("Invalid input. ContactNumber should start with 09 followed by 9 digits (numbers only).");
                    }
                }

                while (true) {
                    System.out.print("Enter your IDnumber: ");
                    IDnumber = scanner.nextInt();
                    scanner.nextLine();
                    if (IDnumber > 0) {
                        break;
                    } else {
                        System.out.println("Please enter a positive number: ");
                    }
                }

                while (true) {
                    System.out.println("Enter your Balance: ");
                    balance = scanner.nextInt();
                    if (balance >= 100) {
                        break;
                    } else {
                        System.out.println("Please enter balance not less than 100!");
                    }
                }

                System.out.println("Enter your Time(Hours): ");
                hours = scanner.nextInt();

                System.out.println("Choose a payment method: ");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
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
                    System.out.println("Would you like to confirm payment? (Y/N): ");
                    String confirmation = scanner.nextLine();

                    if (confirmation.equalsIgnoreCase("Y")) {
                        prembill.confirmPayment();
                        System.out.println("Payment confirmed!");
                        break;
                    } else if (confirmation.equalsIgnoreCase("N")) {
                        System.out.println("Payment not Confirmed! Please try again.");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input. Please enter 'Y' or 'N'.");

                    }
                }

                Premium premiumAccount = new Premium(name, contact_number, email, accstatus, IDnumber, hours, 500, "PREMIUM", 30);
                premiumAccount.displayUserInfo();

                prembill.displayPaymentMethod();

                ComputerSpecs ComputerPrem = new ComputerSpecs(100, true, true, "Acer Nitro VG240Y", "RTX 4090");
                ComputerPrem.DisplaySpecs();

                premiumAccount.startCountdown(hours);

                break;

            default:
                System.out.println("Please try again!.");
                break;
        }

        scanner.close();
    }
}

