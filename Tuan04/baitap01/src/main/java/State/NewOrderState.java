package State;

public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("New Order State");
        context.setState(new ProcessingOrderState());
    }
}
