package com.tahir.retailer.web.model;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;


public class LoginBean {

    @Value("${backendApp.URL}")
    private String  backendAppURL;

    @Value("${backendApp.login.URL}")
    private String loginServiceURL;

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        boolean loggedIn = false;

        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
        list.add(new MappingJacksonHttpMessageConverter());
        restTemplate.setMessageConverters(list);




        String url= backendAppURL;
        url= url + loginServiceURL;
        User user= restTemplate.postForObject(url, this, User.class);

        if(username != null  && username.equals("admin") && password != null  && password.equals("admin")) {
            loggedIn = true;
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("loggedIn", loggedIn);
    }
}
