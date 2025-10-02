package Adapter;

public class AdapterComputerWithVGAToMonitorWithHDMI extends ComputerWithVGA implements MonitorWithHDMI {

    @Override
    public void outputVideo() {
        super.outputVideo();
        System.out.println("Converting VGA signal to HDMI");
    }
}
