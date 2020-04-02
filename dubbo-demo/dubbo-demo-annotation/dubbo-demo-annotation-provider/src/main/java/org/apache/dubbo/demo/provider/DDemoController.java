package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoController;
import org.apache.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DDemoController implements DemoController {
    @Autowired
    DemoService demo;

    @RequestMapping(value = "/say")
    public String sayHello(String name) {
        return demo.sayHello(name);
//        return "hello";
    }
}
