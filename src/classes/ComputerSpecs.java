package classes;

public class ComputerSpecs {

    int ComputerID;
    boolean ComputerStatus;
    boolean ConnectionStatus;
    String Monitor;
    String Gpu;

    public ComputerSpecs(int ComputerID, boolean ComputerStatus, boolean ConnectionStatus, String Monitor, String Gpu) {
        this.ComputerID = ComputerID;
        this.ComputerStatus = ComputerStatus;
        this.ConnectionStatus = ConnectionStatus;
        this.Monitor = Monitor;
        this.Gpu = Gpu;
    }

    public void DisplaySpecs() {

        System.out.println("###COMPUTER_SPECIFICATIONS###");
        System.out.println("ComputerID: " + ComputerID);
        System.out.println("ComputerStatus: " + ComputerStatus);
        System.out.println("ConnectionStatus: " + ConnectionStatus);
        System.out.println("Monitor: " + Monitor);
        System.out.println("GPU: " + Gpu);
        System.out.println("##############################\n");

    }

}

