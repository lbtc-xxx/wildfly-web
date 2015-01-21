package test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MyBean {
    public String hello() {
        return "This string comes from MyBean! write something here to check hot deployment!";
    }
}