import java.util.Scanner;

import classes.BillingMethod;
import classes.ComputerSpecs;
import classes.Premium;
import classes.Regular;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type (Regular/Premium): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Regular")) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();


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

            System.out.print("Enter your IDnumber: ");
            int IDnumber = scanner.nextInt();
            scanner.nextLine();

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

            BillingMethod billing = new BillingMethod(paymentMethod);

            while (true) {
                System.out.println("Would you like to confirm payment? (yes/no): ");
                String confirmation = scanner.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    billing.confirmPayment();
                    System.out.println("Payment confirmed!");
                    break;
                } else if (confirmation.equalsIgnoreCase("no")) {
                    System.out.println("Payment not Confirmed! Please try again.");
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }


            Regular regularAccount = new Regular(name, contact_number, email, accstatus, IDnumber, hours, balance, "REGULAR", 40);
            regularAccount.displayUserInfo();

            billing.displayPaymentMethod();

            ComputerSpecs Computer = new ComputerSpecs(50, true, true, "Nvision N200V8 20 LED Monitor", "RTX 3080 ti");
            Computer.DisplaySpecs();

            regularAccount.startCountdown(hours);

        } else if (type.equalsIgnoreCase("Premium")) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

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

            System.out.print("Enter your IDnumber: ");
            int IDnumber = scanner.nextInt();
            scanner.nextLine();

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

            BillingMethod billing = new BillingMethod(paymentMethod);

            while (true) {
                System.out.println("Would you like to confirm payment? (yes/no): ");
                String confirmation = scanner.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    billing.confirmPayment();
                    System.out.println("Payment confirmed!");
                    break;
                } else if (confirmation.equalsIgnoreCase("no")) {
                    System.out.println("Payment not Confirmed! Please try again.");
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");

                }
            }

            Premium premiumAccount = new Premium(name, contact_number, email, accstatus, IDnumber, hours, 500, "PREMIUM", 30);
            premiumAccount.displayUserInfo();

            billing.displayPaymentMethod();

            ComputerSpecs Computer = new ComputerSpecs(100, true, true, "Acer Nitro VG240Y", "RTX 4090");
            Computer.DisplaySpecs();

            premiumAccount.startCountdown(hours);

        } else {
            System.exit(0);
        }

        scanner.close();
    }
}

