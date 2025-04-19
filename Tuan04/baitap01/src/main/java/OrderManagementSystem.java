import State.OrderContext;
import Strategy.ExpressShipping;
import Strategy.StandardShipping;

public class OrderManagementSystem {
    public static void main(String[] args) {
        // 1️⃣ State Pattern - Xử lý trạng thái đơn hàng
        OrderContext orderContext = new OrderContext();
        orderContext.process();  // Mới tạo -> Đang xử lý
        orderContext.process();  // Đang xử lý -> Đã giao

        System.out.println("------------------------");

        // 2️⃣ Strategy Pattern - Chọn chiến lược giao hàng
        Order order = new Order(new StandardShipping());
        order.processShipping(); // Giao hàng tiêu chuẩn

        order.setShippingStrategy(new ExpressShipping());
        order.processShipping(); // Chuyển sang giao hàng nhanh

        System.out.println("------------------------");

    }
}
