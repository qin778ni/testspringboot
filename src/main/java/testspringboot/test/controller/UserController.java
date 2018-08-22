package testspringboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testspringboot.test.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author:ms.y
 * @create 2018/7/30-11:14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request, HttpServletResponse response) {

        boolean tag = userService.findUserById(request.getParameter("id"));

        if (tag) {
            return "{\"ok\":\"ok\"}";
        }else {
            return "{\"false\":\"false\"}";
        }
    }

}
