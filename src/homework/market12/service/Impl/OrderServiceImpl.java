package homework.market12.service.Impl;

import homework.market12.model.order.Order;
import homework.market12.model.order.PaymentMethod;
import homework.market12.service.OrderService;

public class OrderServiceImpl implements OrderService {
    private Order[] orders = new Order[10];
    private int size = -1;


    @Override
    public void printOrders() {
        for (int i = 0; i <= size; i++) {
            System.out.println(orders[i]);
        }
    }

    @Override
    public void add(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[++size]=order;
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, size);
        orders = tmp;
    }



    @Override
    public Order getOrderById(String id) {
        for (int i = 0; i <= size ; i++) {
            if (orders[i].getId().equals(id)){
                return orders[i];
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size <= -1;
    }

    @Override
    public void printPaymentMethod() {
        PaymentMethod[] paymentMethods = PaymentMethod.values();
        for (PaymentMethod paymentMethod : paymentMethods) {
            System.out.println(paymentMethod);
        }
    }

    @Override
    public void getOrdersByUserId(String userId) {
        for (int i = 0; i <=size ; i++) {
            if (orders[i].getUser().getId().equals(userId)){
                System.out.println(orders[i]);
            }
        }
    }

    @Override
    public boolean isEmpty(String userId) {
        for (int i = 0; i <= size ; i++) {
            if (orders[i].getUser().getId().equals(userId)){
                return false;
            }
        }
        return true;
    }
}
