package com.cppba.config;

import com.bstek.ureport.UReportPropertyPlaceholderConfigurer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class PropertiesConfiguration extends UReportPropertyPlaceholderConfigurer implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        Properties props=new Properties();
        props.setProperty("ureport.fileStoreDir", "./ureportfiles");
        setProperties(props);
    }
}
