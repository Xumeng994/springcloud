package com.eurekaclient.client.abstraction;

import com.eurekaclient.client.service.IClientService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName AbstractionClient.java
 * @Description TODO
 * @createTime 2020年03月03日 22:55:00
 */
public abstract class AbstractionClient {

    private IClientService clientService;

    public AbstractionClient(IClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * @throws
     * @title
     * @description 持久化客户信息及需求
     * @author xumeng
     * @updateTime 2020/3/5 18:49
     */
    public abstract void persistClient();

    /**
     * @throws
     * @title
     * @description 写跟进
     * @author xumeng
     * @updateTime 2020/3/5 18:48
     */
    public abstract void writeFollowRecord();

    /**
     * @throws
     * @title
     * @description 修改客户需求详情
     * @author xumeng
     * @updateTime 2020/3/5 18:48
     */
    public abstract void updateClientNeedInfo();

    /**
     * @title
     * @description 修改客户信息
     * @author xumeng
     * @updateTime 2020/3/5 19:14
     * @throws
     */
    public void updateClientInfo(){
        clientService.updateClientInfo();
    }

}