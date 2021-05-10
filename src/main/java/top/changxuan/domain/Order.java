package top.changxuan.domain;

/**
 * @ClassName Order
 * @Description 订单
 * @Author changxuan
 * @Date 2021/5/10 下午10:18
 **/
public class Order {

    private String userName;

    private String product;

    public Order(String userName, String product) {
        this.userName = userName;
        this.product = product;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userName='" + userName + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
