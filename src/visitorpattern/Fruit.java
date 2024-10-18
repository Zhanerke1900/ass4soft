package visitorpattern;

class Fruit implements ItemElement {
    private String name;
    private int weight;
    private int pricePerKg;

    public Fruit(String name, int weight, int pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}