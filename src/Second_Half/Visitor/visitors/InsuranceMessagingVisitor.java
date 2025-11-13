package Second_Half.Visitor.visitors;

import Second_Half.Visitor.api.IVisitor;
import Second_Half.Visitor.domain.*;

import java.util.List;

public class InsuranceMessagingVisitor implements IVisitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Sending theft insurance mail to bank: " + bank.getName());
    }

    @Override
    public void visit(Company company) {
        System.out.println("Sending equipment and employee insurance mail to company: " + company.getName());
    }

    @Override
    public void visit(Resident resident) {
        System.out.println("Sending health insurance mail to resident: " + resident.getName());
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Sending fire and food insurance mail to restaurant: " + restaurant.getName());
    }
}
