package top.yfine.wechat.sdk.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 杨帆
 * @date 2018/12/29 10:10
 */
@ConfigurationProperties("wechat")
@Data
public class WechatProperties {
    /**
     * your appid
     */
    private String appId;
    /**
     * your appsecret
     */
    private String appSecret;
}
