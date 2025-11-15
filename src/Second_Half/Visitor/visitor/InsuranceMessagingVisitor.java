package Second_Half.Visitor.visitor;

import Second_Half.Visitor.api.IVisitor;
import Second_Half.Visitor.domain.*;

import java.util.List;

public class InsuranceMessagingVisitor implements IVisitor {

    public void setVisitBank(String visitBank) {
        this.visitBank = visitBank;
    }

    public void setVisitResident(String visitResident) {
        this.visitResident = visitResident;
    }

    public void setVisitRestaurant(String visitRestaurant) {
        this.visitRestaurant = visitRestaurant;
    }

    private String visitBank = "Sending theft insurance mail to bank: ";

    public void setVisitCompany(String visitCompany) {
        this.visitCompany = visitCompany;
    }

    private String visitCompany = "Sending equipment and employee insurance mail to company: ";
    private String visitResident = "Sending health insurance mail to resident: ";
    private String visitRestaurant = "Sending and food insurance mail to restaurant: ";

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println(visitBank + bank.getName());
    }

    @Override
    public void visit(Company company) {
        System.out.println(visitCompany + company.getName());
    }

    @Override
    public void visit(Resident resident) {
        System.out.println(visitResident + resident.getName());
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println(visitRestaurant + restaurant.getName());
    }
}
