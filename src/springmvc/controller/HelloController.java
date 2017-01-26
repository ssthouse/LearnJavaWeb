package springmvc.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.bean.TestBean;


/**
 * Created by ssthouse on 26/01/2017.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(path = "/{username}", method = RequestMethod.GET)
    @ResponseBody
    public String printHello(@PathVariable String username) {
        return new Gson().toJson(new TestBean(username, 21));
    }
}