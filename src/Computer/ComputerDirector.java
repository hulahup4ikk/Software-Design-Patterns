package Computer;

// Director
public class ComputerDirector {
    public Computer constructI7(ComputerBuilder builder) {
        builder.setCPU("Intel i7");
        builder.setRAM("16GB");
        return builder.build();
    }

    public Computer constructI5(ComputerBuilder builder) {
        builder.setCPU("Intel i5");
        builder.setRAM("8GB");
        return builder.build();
    }
}