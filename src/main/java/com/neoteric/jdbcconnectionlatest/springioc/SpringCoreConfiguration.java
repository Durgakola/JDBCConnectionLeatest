package com.neoteric.jdbcconnectionlatest.springioc;

//import com.neoteric.jdbcconnectionlatest.springioc.diffrentconnections.*;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages ="com.neoteric.jdbcconnectionlatest.springioc")
@Configuration
public class SpringCoreConfiguration {

//    TCPConnectionService tcpConnectionService;
    @Bean
    public ExternalJavaService getExternalJavaService(){
        ExternalJavaService externalJavaService=new ExternalJavaService();
        return new ExternalJavaService();
    }

//    @Bean
//    public TCPConnectionService tcpConnectionService(){
//
//        return new TCPConnectionService();
//    }
//    @Bean
//    public ConnectionService mysqlConnectionService(TCPConnectionService tcpConnectionService){
//        return new MySqlConnectionService(tcpConnectionService);
//    }

//    @Bean
//    public ConnectionService oracleConnectionService(TCPConnectionService tcpConnectionService){
//        return new OracleConnectionService(tcpConnectionService);
//
//    }

}
