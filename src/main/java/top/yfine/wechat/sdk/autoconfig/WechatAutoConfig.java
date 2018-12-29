package top.yfine.wechat.sdk.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.yfine.wechat.sdk.service.WechatService;
import top.yfine.wechat.sdk.service.impl.WechatServiceImpl;

/**
 * @author 杨帆
 * @date 2018/12/29 10:13
 */
@Configuration
@EnableConfigurationProperties(WechatProperties.class)
public class WechatAutoConfig {
    @Autowired
    private WechatProperties properties;

    @Bean
    public WechatService wechatService() {
        return new WechatServiceImpl(properties.getAppId(), properties.getAppSecret());
    }
}
