package com.demo.motan.client.config;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MotanConfig {

    @Bean
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        motanAnnotationBean.setPackage("com.demo.motan.client");
        return motanAnnotationBean;
    }

    @Bean(name = "demoMotan")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        config.setDefault(true);
        config.setName("motan");
        config.setMaxContentLength(1048576);
        return config;
    }

    @Bean(name = "registryConfig")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        config.setRegProtocol("direct");
        config.setAddress("127.0.0.1:8002");
        return config;
    }

    @Bean(name = "motantestClientBasicConfig")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        config.setProtocol("demoMotan");
        config.setGroup("testgroup");
        config.setModule("motan-demo-rpc");
        config.setApplication("myMotanDemo");
        config.setRegistry("registryConfig");
        config.setCheck(false);
        config.setAccessLog(true);
        config.setRetries(2);
        config.setThrowException(true);
        return config;
    }

}
