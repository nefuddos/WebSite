package com.another.protector.config;

import com.another.protector.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * 路由器函数 配置
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     * Servlert
     * 请求接口：ServletRequest 或者HttpServletRequest
     * 响应接口：ServletResponse 或者 HttpServletResponse
     * Spring 5.0 重新定义了服务请求和响应接口
     * 请求接口：ServerRequest
     * 响应接口：ServerResponse
     * 既可以支持Servlet规范，也可以支持自定义，比如Netty Web Server
     */
    /**
     * 定义 GET 请求，并且返回所有的用户对象，URI: person/find/all
     */
//    @Bean
//    @Autowired
//    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository){
//
//    }
}
