package Second_Half.Visitor.domain;

import Second_Half.Visitor.api.IVisitor;

public class Company extends Client {
    public Company(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
