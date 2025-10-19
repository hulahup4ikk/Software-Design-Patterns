package First_Half.Computer;

public class Main{
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new DesktopComputerBuilder();
        Computer computerI5 = director.constructI5(builder);
        System.out.println(computerI5);
        Computer computerI7 = director.constructI7(builder);
        System.out.println(computerI7);
    }
}