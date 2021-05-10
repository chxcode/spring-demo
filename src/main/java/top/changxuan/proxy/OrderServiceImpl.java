package top.changxuan.proxy;

import top.changxuan.domain.Order;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author changxuan
 * @Date 2021/5/10 下午10:24
 **/
public class OrderServiceImpl implements OrderService{

    private static Order order = null;

    @Override
    public Order creatOrder(String userName, String product) {
        order = new Order(userName, product);
        return order;
    }

    @Override
    public Order queryOrder(String userName) {
        return order;
    }
}
