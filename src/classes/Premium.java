package classes;

public class Premium extends UserAccount {

    int hours;
    double balance;
    String Premium;
    int rate;

    public Premium(String name, String contact_number, String email, boolean accstatus, int IDnumber, int hours, double balance, String Premium, int rate) {
        super(name, contact_number, email, accstatus, IDnumber);
        this.hours = hours;
        this.balance = balance;
        this.Premium = Premium;
        this.rate = rate;
    }

    public double Change() {
        return balance - (rate * hours);
    }

    public double Total() {
        return (rate * hours);
    }

    @Override
    public void displayUserInfo() {
        super.displayUserInfo();

        System.out.println("##########***ACCOUNT TYPE:PREMIUM***##################");
        System.out.println("Rate: " + rate);
        System.out.println("Balance: " + balance);
        System.out.println("Total: " + Total());
        System.out.println("Change: " + Change());
        System.out.println("##############################\n");
    }

    public void startCountdown(int hours) {
        int seconds = hours * 3600; // Convert hours to seconds

        for (int i = seconds; i >= 0; i--) {
            int remainingHours = i / 3600;
            int remainingMinutes = (i % 3600) / 60;
            int remainingSeconds = i % 60;

            System.out.printf("\rRemaining time - Regular: %02d:%02d:%02d", remainingHours, remainingMinutes, remainingSeconds);
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n Countdown complete!");
    }

}
