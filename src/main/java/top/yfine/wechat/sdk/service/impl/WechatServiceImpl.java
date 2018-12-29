package top.yfine.wechat.sdk.service.impl;

import top.yfine.wechat.sdk.service.WechatService;

/**
 * @author 杨帆
 * @date 2018/12/29 10:15
 */
public class WechatServiceImpl implements WechatService {
    private String appId;
    private String appSecret;

    public WechatServiceImpl(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    @Override
    public void hello() {
        System.out.println("say hi.");
        System.out.printf("%s -> %s", appId, appSecret);
    }
}
