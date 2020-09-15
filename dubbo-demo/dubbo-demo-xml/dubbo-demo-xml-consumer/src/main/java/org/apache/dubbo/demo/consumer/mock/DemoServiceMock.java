package org.apache.dubbo.demo.consumer.mock;

import org.apache.dubbo.demo.DemoService;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName : DemoServiceMock
 * @Author : LeonardoEzio
 * @Date : 2020-09-11 21:04
 * @Description : mock
 */
public class DemoServiceMock implements DemoService {

    @Override
    public String sayHello(String name) {
        return "response from demoService Mock "+name;
    }


}
