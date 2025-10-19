package First_Half.Computer;

public class Computer {
    private String CPU;
    private String RAM;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    @Override
    public String toString() {
        return "FirstHalf.Computer { CPU = " + CPU + ", RAM = " + RAM + " }";
    }
}

