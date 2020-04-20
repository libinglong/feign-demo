package com.example.feigndemo;

import com.example.feigndemo.feignclient.Baidu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author binglongli217932
 * <a href="mailto:libinglong9@gmail.com">libinglong:libinglong9@gmail.com</a>
 * @since 2020/4/17
 */
@Controller
public class BaiController {

    @Autowired
    Baidu baidu;

    public void a(){
        baidu.content();
    }

}
