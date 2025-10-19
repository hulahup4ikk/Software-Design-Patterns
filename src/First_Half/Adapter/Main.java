package First_Half.Adapter;

public class Main {

    public static void main(String[] args) {

        ComputerWithVGA computer = new ComputerWithVGA();

        MonitorWithHDMI monitorWithHDMI = new AdapterComputerWithVGAToMonitorWithHDMI(computer);

        monitorWithHDMI.receiveHdmiSignal();

    }
}
