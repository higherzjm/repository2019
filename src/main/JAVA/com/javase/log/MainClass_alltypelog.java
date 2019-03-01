package com.javase.log;

import org.junit.Test;


/**
 * Created by zjm on 2019/2/25.
 *
 * 常用的日志类型
 */
public class MainClass_alltypelog {

    /**
     * dk自带(JUL)，红色字体
     */
    @Test //hamcrest-core-1.3.jar是 junit  依赖下载的
    public  void test1jdkLog(){
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(String.valueOf(MainClass_alltypelog.class));
        log.info("jdkLog_abc123张三");
        test2_log4j();
        test3_commonsLog();
        test4_slf4jLog();
    }

    /**
     * 白色字体
     * og4j 报这个错误：ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration
     * (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug'
     * to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html
     * for instructions on how to configure Log4j 2  是因为resources目录缺乏这个配置文件 log4j2.xml
     */
    @Test
    public  void test2_log4j(){
        org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(String.valueOf(MainClass_alltypelog.class));
        log.info("log4j_abc123张三_info");
        log.error("log4j_abc123张三_error");
        log.debug("log4j_abc123张三_debug");
    }

    /**
     * Jakarta  Commons-logging（JCL）是apache最早提供的日志的门面接口。提供简单的日志实现以及日志解耦功能。
     * 红色字体
     */
    @Test
    public  void test3_commonsLog(){
        org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MainClass_alltypelog.class);
        log.info("JCL_abc123张三");
    }

    /**
     *简单日志门面(Simple Logging Facade for Java)
     * 红色字体
     */
    @Test
    public  void test4_slf4jLog(){
        org.slf4j.Logger  log = org.slf4j.LoggerFactory.getLogger(MainClass_alltypelog.class);
        log.info("slf4jLog_abc123张三");
    }

    public void test20190301(){
        System.out.println("更新2019-03-01 14:46");
    }
}
