package com.springclound.serviceribbon.controller;

import com.springclound.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Gao
 * @date 2018/9/4 17:28
 *
 * 1.写一个controller，在controller中用调用HelloService 的方法，代码如下：
 * 2.在浏览器上多次访问http://localhost:8764/hi?name=forezp，浏览器交替显示：
 * hi forezp,i am from port:8762
 * hi forezp,i am from port:8763
 *
 * 3.这说明当我们通过调用restTemplate.getForObject(“http://SERVICE-HI/hi?name=“+name,String.class)方法时，
 * 已经做了负载均衡，访问了不同的端口的服务实例。
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
