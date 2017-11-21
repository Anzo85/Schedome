package System.Controllers;

import System.Model.User;
import System.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserCntroller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public
    @ResponseBody
    String getAllUsers() {
        String result = userService.getUsers().toString();
        return result;
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public
    @ResponseBody
    void setAllUsers() {

        userService.setUser();

    }
}
