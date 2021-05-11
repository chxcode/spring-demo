package top.changxuan.proxy;

import top.changxuan.domain.Order;

public interface OrderService {

    Order createOrder(String userName, String product);

    Order queryOrder(String userName);

}
