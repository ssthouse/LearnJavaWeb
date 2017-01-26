package springmvc.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ssthouse on 26/01/2017.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @RequestMapping("/{username}")
    @ResponseBody
    public String getUserInfo(@PathVariable String username) {
        return new Gson().toJson(new UserInfo(username, "22"));
    }

    @RequestMapping("/{username}/blog/{blogId}")
    @ResponseBody
    public String getUserBlogInfo(@PathVariable String username, @PathVariable int blogId) {
        return String.format("username: %s; blogId: %d", username, blogId);
    }

}
