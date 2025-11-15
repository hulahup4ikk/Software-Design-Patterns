package Second_Half.Visitor.app;

import Second_Half.Visitor.domain.*;
import Second_Half.Visitor.visitor.InsuranceMessagingVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("Halyk Bank", "Wall Street 12", "+1 222 123"),
                new Company("TechCorp", "Silicon Valley 88", "+1 222 777"),
                new Resident("Ivan Kuznetsov", "Uly Dala avenue 27", "+7 708 224 14 31"),
                new Restaurant("Steak House", "Main Avenue 9", "+1 222 333")
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);//aaa
    }
}
