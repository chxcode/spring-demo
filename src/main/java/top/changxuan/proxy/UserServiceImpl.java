package top.changxuan.proxy;

import top.changxuan.domain.User;

/**
 * @ClassName UserServiceImpl
 * @Description 用户服务实现类
 * @Author changxuan
 * @Date 2021/5/10 下午10:22
 **/
public class UserServiceImpl implements UserService{

    private static User user = null;

    @Override
    public User createUser(String firstName, String lastName, int age) {
        user = new User(firstName, lastName, age);
        return user;
    }

    @Override
    public User queryUser() {
        return user;
    }
}
