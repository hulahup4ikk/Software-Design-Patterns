package Computer;

// Builder Interface
public interface ComputerBuilder {
    void setCPU(String cpu);
    void setRAM(String ram);
    Computer build();
}