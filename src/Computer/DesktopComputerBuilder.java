package Computer;

// Concrete Builder
public class DesktopComputerBuilder implements ComputerBuilder {


    private Computer computer = new Computer();

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void setCPU(String cpu) {
        computer.setCPU(cpu);
    }
    @Override
    public void setRAM(String ram) {
        computer.setRAM(ram);
    }
    @Override public Computer build() {
        return computer;
    }
}
