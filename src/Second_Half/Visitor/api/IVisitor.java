package Second_Half.Visitor.api;

import Second_Half.Visitor.domain.Bank;
import Second_Half.Visitor.domain.Company;
import Second_Half.Visitor.domain.Resident;
import Second_Half.Visitor.domain.Restaurant;

public interface IVisitor {
    void visit(Bank bank);
    void visit(Company company);
    void visit(Resident resident);
    void visit(Restaurant restaurant);
}
