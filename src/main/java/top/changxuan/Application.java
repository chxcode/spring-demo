package top.changxuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.changxuan.domain.Message;
import top.changxuan.service.MessageService;

/**
 * @ClassName top.changxuan.Application
 * @Description
 * @Author changxuan
 * @Date 2021/4/9 下午10:52
 **/
public class Application {
    public static void main(String[] args) {
        // 通过配置文件来启动一个 ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");

        System.out.println("启动成功");

        // 取出我们通过配置文件注册的 Bean
        MessageService messageService = applicationContext.getBean(MessageService.class);
        System.out.println(messageService.getMessage());

        applicationContext.getAutowireCapableBeanFactory();


    }

    public void testHeapLeak() {
        // Test ThreadLocal Heap Leak
//        Message msg = new Message(1L, "110");
        ThreadLocal<Message> temp = new ThreadLocal<>();

        temp.set(new Message(1L, "110"));

        ThreadLocal<Message> anotherTemp = new ThreadLocal<>();
        anotherTemp.set(new Message(1L, "110"));

        System.out.println(temp.get().toString());
        System.out.println(anotherTemp.get().toString());
//        msg.setMsg("119");
        System.gc();
        System.out.println(temp.get().toString());
        System.out.println(anotherTemp.get().toString());

    }

}
