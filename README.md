##  集成ureport2(复杂报表的设计制作)
### pom.xml加入依赖
```xml
<dependency>
    <groupId>com.bstek.ureport</groupId>
    <artifactId>ureport2-console</artifactId>
    <version>2.1.0</version>
</dependency>
```
### 增加配置文件ReportConfig.java
```java
package com.cppba.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("classpath:ureport-console-context.xml")
public class ReportConfig {

    @Bean
    public ServletRegistrationBean ureportServletRegistrationBean() {
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");// ServletName默认值为首字母小写，即myServlet
    }
}
```