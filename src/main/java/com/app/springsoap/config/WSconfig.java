package com.app.springsoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WSconfig extends WsConfigurerAdapter{

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
        MessageDispatcherServlet message = new MessageDispatcherServlet();
        message.setApplicationContext(context);
        message.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(message, "/soapWS/*");
    }

    @Bean(name = "nasabah")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema nasabahSchema){
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("NasabahPort");
        definition.setLocationUri("/soapWS");
        definition.setTargetNamespace("http://myhost.com/spring-soap/nasabah-ws");
        definition.setSchema(nasabahSchema());
        return definition;
    }

    @Bean
    public XsdSchema nasabahSchema(){
        return new SimpleXsdSchema(new ClassPathResource("nasabah.xsd"));
    }
}
