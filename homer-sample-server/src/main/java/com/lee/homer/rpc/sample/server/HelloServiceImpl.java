package com.lee.homer.rpc.sample.server;

import com.lee.homer.rpc.sample.client.HelloService;
import com.lee.homer.rpc.sample.client.Person;
import com.lee.homer.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
