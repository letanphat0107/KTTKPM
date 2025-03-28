package State;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewOrderState(); // Trạng thái mặc định
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}
