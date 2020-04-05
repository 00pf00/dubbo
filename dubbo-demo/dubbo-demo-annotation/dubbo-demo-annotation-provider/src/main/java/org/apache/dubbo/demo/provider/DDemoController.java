package org.apache.dubbo.demo.provider;


import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoController;
import org.apache.dubbo.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class DDemoController implements DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DDemoController.class);
    @Autowired
    DemoService demo;

    @RequestMapping(value = "/say")
    public String sayHello(String name) {
        logger.info("----------------controller = {}-------------------",this.hashCode());
        return demo.sayHello(name);
//        return "hello";
    }
}
