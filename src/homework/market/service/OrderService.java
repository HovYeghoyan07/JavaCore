package homework.market.service;

import homework.market.model.order.Order;

public interface OrderService {
    void printOrders();

    void add(Order order);



    Order getOrderById(String id);

    boolean isEmpty();

    void printPaymentMethod();

    void getOrdersByUserId(String userId);

    boolean isEmpty(String userId);
    }

