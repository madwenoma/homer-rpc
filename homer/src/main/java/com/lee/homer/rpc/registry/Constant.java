package com.lee.homer.rpc.registry;

/**
 * 常量
 *
 * @author leefee
 * @since 1.0.0
 */
public interface Constant {

    int ZK_SESSION_TIMEOUT = 5000;

    String ZK_REGISTRY_PATH = "/testRootPath";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH;
//    String ZK_REGISTRY_PATH = "/registry";
//    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}