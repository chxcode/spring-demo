package top.changxuan.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName DebugInterceptor
 * @Description
 * @Author changxuan
 * @Date 2021/5/11 下午10:40
 **/
public class DebugInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Before: invocation=[" + invocation + "]");
        // 执行 实现类 的方法
        Object val = invocation.proceed();
        System.out.println("Invocation returned");
        return val;
    }

}
