package org.apache.dubbo.demo;

import org.apache.dubbo.demo.DemoService;

/**
 * @ClassName : DemoServiceStub
 * @Author : LeonardoEzio
 * @Date : 2020-09-11 20:44
 * @Description : demoService本地存根
 */
public class DemoServiceStub implements DemoService {


    private DemoService localDemoService ;


    public DemoServiceStub(DemoService localDemoService ) {
        this.localDemoService = localDemoService  ;
    }


    @Override
    public String sayHello(String name) {
        return "response from DemoServiceStub";
    }
}
