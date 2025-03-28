import Strategy.ShippingStrategy;

public class Order {
    private ShippingStrategy shippingStrategy;

    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void processShipping() {
        shippingStrategy.ship();
    }
}
