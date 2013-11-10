package com.tahir.retailer.web.bean;

/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/21/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class MenuBean {

    public void save() {
        addMessage("Data saved");
    }

    public void update() {
        addMessage("Data updated");
    }

    public void delete() {
        addMessage("Data deleted");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

