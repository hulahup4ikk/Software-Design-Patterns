package First_Half.Factory_Method;

public class Client {
    private Vehicle currentVehicle;

    public Client(VehicleFactory factory) {
        currentVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return currentVehicle;
    }
}

