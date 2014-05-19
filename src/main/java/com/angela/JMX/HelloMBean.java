package main.java.com.angela.JMX;

/**
 * Created by Angela on 5/18/2014.
 * To manage Hello we need to create a MBean，methods in MBean can be managed.
 * There is naming convention for MBean,that is class name plus "MBean"
 */
public interface HelloMBean {

    /**
     * These methods can be managed
     * @return
     */
    public String getName();

    public void setName(String name);

    public void printHello();

    public void printHello(String whoName);

}
