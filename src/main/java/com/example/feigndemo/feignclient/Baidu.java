package com.example.feigndemo.feignclient;

import feign.RequestLine;

/**
 * @author binglongli217932
 * <a href="mailto:libinglong9@gmail.com">libinglong:libinglong9@gmail.com</a>
 * @since 2020/4/17
 */
public interface Baidu {

    @RequestLine("GET /")
    String content();

}
