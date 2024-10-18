package visitorpattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book("1234", 20),
                new Book("5678", 100),
                new Fruit("Apple", 2, 10),
                new Fruit("Banana", 3, 5)
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int totalCost = 0;

        for (ItemElement item : items) {
            item.accept(visitor);
        }
    }
}
