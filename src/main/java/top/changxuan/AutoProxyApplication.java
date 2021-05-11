package top.changxuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.changxuan.proxy.OrderService;
import top.changxuan.proxy.UserService;

/**
 * @ClassName AutoProxyApplication
 * @Description 自动代理
 * @Author changxuan
 * @Date 2021/5/11 下午10:50
 **/
public class AutoProxyApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_1_autoproxy.xml");

        UserService userService = context.getBean(UserService.class);

        userService.createUser("xuan", "chang", 20);

        userService.queryUser();

        OrderService orderService = context.getBean(OrderService.class);

        orderService.createOrder("changxuan", "apple");

        orderService.queryOrder("chang");
    }

}
