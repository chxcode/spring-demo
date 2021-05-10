package top.changxuan.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName LogArgsAdvice
 * @Description 前置增强
 * @Author changxuan
 * @Date 2021/5/10 下午10:25
 **/
public class LogArgsAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("准备执行方法：" + method.getName() + "，参数列表：" + Arrays.toString(objects));
    }

}
