package Second_Half.Visitor.domain;

import Second_Half.Visitor.api.IVisitor;

public class Restaurant extends Client {
    public Restaurant(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
