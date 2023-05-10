package ncjt.controller;

import ncjt.pojo.User;
import ncjt.service.UserService;
import ncjt.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void insertUser(User user){
        //检查一下数据是否合法
        System.out.println("检查一下数据是否合法");
        //交给业务层去完成
        userService.inserUser(user);
    }
}
