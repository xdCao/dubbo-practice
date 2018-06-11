package xdcao.controller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RestController;
import xdcao.common.service.UserService;

@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    public String login(){
        return userService.login();
    }

}
