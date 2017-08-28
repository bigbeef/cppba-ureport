package com.cppba.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:ureport-console-context.xml")
public class ReportConfig {

    @Bean
    public ServletRegistrationBean ureportServletRegistrationBean() {
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");// ServletName默认值为首字母小写，即myServlet
    }
}
