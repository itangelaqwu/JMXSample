package main.java.com.angela.JMX;

import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

/**
 * Created by Angela on 5/18/2014.
 * Administrator is an Agent class，explain： create a MBeanServer first to be container of MBean
 *         将Hello这个类注入到MBeanServer中，注入需要创建一个ObjectName类
 *         create an AdaptorServer，this class determine the UI of MBean，here we use Html.
 *         AdaptorServer is a MBean also
 *         angelaqwu:name=HelloWorld is formatted, format rule：“Domain name:name=MBean name”，
 *         域名和MBean名称都可以任意取。
 */
public class HelloAgent {

    public static void main(String[] args) throws Exception {
        //create a MBeanServer to be container of MBean
        MBeanServer server = MBeanServerFactory.createMBeanServer();
        //put Hello to MBeanServer，need to create an ObjectName
        ObjectName helloName = new ObjectName("angelaqwu:name=HelloWorld");

        server.registerMBean(new Hello(), helloName);
        ObjectName adapterName = new ObjectName(
                "HelloAgent:name=htmladapter,port=6666");
        //create an AdaptorServer，this class is the UI of MBean，here we use Html UI
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
        server.registerMBean(adapter, adapterName);

        adapter.start();
        System.out.println("start.....");
    }
}
