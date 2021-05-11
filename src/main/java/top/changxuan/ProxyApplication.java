package top.changxuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.changxuan.proxy.OrderService;
import top.changxuan.proxy.UserService;

/**
 * @ClassName ProxyApplication
 * @Description
 * @Author changxuan
 * @Date 2021/5/10 下午10:43
 **/
public class ProxyApplication {

    public static void main(String[] args) {

        // 针对全部方法进行增强，类粒度 advice
        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_1.xml");

        // 针对指定方法进行增强， 方法粒度 advisor + advice
        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_1_advisor.xml");

        // Interceptor
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_1_interceptor.xml");

        UserService userService = (UserService) context.getBean("userServiceProxy");

        userService.createUser("xuan", "chang", 20);

        userService.queryUser();

        OrderService orderService = (OrderService) context.getBean("orderServiceProxy");

        orderService.createOrder("changxuan", "apple");

        orderService.queryOrder("chang");
    }

}
