package com.springexample.demo.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component // @Component is an annotation that allows Spring to automatically detect our custom beans.
public class CurrencyServiceConfiguration {
// Beans  , consider them as object as of now
    //we are here using properties file where we have instantiated this parameters below
    //When we call using postman , those values will be shown there
    // This is happening because above configurationproperties annotation is used ,which is picking from app.properties file
    private String url;
    private String username;
    private String key;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

//    public CurrencyServiceConfiguration(String url, String username, String key) {
//
//        this.url = url;
//        this.username = username;
//        this.key = key;
    }

