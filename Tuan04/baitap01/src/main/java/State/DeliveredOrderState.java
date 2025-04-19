package State;

public class DeliveredOrderState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Cập nhật trạng thái: Đơn hàng đã giao.");
    }
}
