package First_Half.Adapter;

public class AdapterComputerWithVGAToMonitorWithHDMI implements MonitorWithHDMI {

    private ComputerWithVGA ComputerWithVGA;

    public AdapterComputerWithVGAToMonitorWithHDMI(ComputerWithVGA ComputerWithVGA) {
        this.ComputerWithVGA = ComputerWithVGA;
    }
    @Override
    public void receiveHdmiSignal() {
        ComputerWithVGA.sendVgaSignal();
        System.out.println("Converting VGA signal to HDMI");
    }
}
