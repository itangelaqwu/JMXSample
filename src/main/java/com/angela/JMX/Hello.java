package main.java.com.angela.JMX;

/**
 * Created by Angela on 5/18/2014.
 *  Hello is class needed to be managed
 */
public class Hello implements HelloMBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello World, " + name);
    }

    public void printHello(String whoName) {
        System.out.println("Hello , " + whoName);
    }
}
