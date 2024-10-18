package visitorpattern;

public interface ItemElement {
    void accept(ShoppingCartVisitor visitor);
}

