package Adapter;

public class AdapterComputerWithVGAToMonitorWithHDMI extends ComputerWithVGA implements MonitorWithHDMI {

    @Override
    public void receiveHdmiSignal() {
        super.sendVgaSignal();
        System.out.println("Converting VGA signal to HDMI");
    }
}
