package State;

public class CanceledOrderState {
    public void handle(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền...");
    }
}
