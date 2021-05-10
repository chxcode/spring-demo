package top.changxuan.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName LogResultAdvice
 * @Description
 * @Author changxuan
 * @Date 2021/5/10 下午10:28
 **/
public class LogResultAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法返回结果：" + o.toString());
    }
}
