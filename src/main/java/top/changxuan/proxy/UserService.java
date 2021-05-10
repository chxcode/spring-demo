package top.changxuan.proxy;

import top.changxuan.domain.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();

}
