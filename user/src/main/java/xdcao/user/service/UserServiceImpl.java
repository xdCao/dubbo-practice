package xdcao.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import xdcao.common.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    public String login() {

        return "hi, i'm login in";

    }

}
