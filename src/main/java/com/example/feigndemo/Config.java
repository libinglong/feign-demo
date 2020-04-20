package com.example.feigndemo;

import com.example.feigndemo.feignclient.Baidu;
import com.netflix.client.ClientException;
import com.netflix.client.ClientFactory;
import com.netflix.client.config.IClientConfig;
import com.netflix.client.config.IClientConfigKey;
import feign.Feign;
import feign.okhttp.OkHttpClient;
import feign.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author binglongli217932
 * <a href="mailto:libinglong9@gmail.com">libinglong:libinglong9@gmail.com</a>
 * @since 2020/4/17
 */
@Configuration
public class Config {

//    @Bean
//    public Baidu baidu() throws ClientException {
//        IClientConfig config = IClientConfig.Builder
//                .newBuilder("baidu")
//                .build()
//                .set(IClientConfigKey.Keys.ListOfServers, "www.baidu.com:80");
//        ClientFactory.registerNamedLoadBalancerFromclientConfig("baidu", config);
//        return Feign.builder()
//                .client(RibbonClient.create())
//                .target(Baidu.class, "http://baidu");
//    }


    @Bean
    public Baidu baidu() throws ClientException {
        return Feign.builder()
                .client(new OkHttpClient())
                .target(Baidu.class, "http://www.baidu.com");
    }

}
