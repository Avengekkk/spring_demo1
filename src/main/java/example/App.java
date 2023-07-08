package example;

import configration.config;
import dao.imp.itemImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.imp.serviceImp;

import javax.sql.DataSource;

public class App {


    public static void main(String[] args) {


        test02();


    }


    public static void test01() {

        //从pom配置文件的依赖来获得IOC容器
        //利用spring-config让XML文件中的元素(bean)来与容器建立联系
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取容器中的元素
        itemImp imp1 = ctx.getBean(itemImp.class);
        imp1.test();


    }


    public static void test02() {


        //从Java类中获得容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
        itemImp imp = ctx.getBean(itemImp.class);
        serviceImp imp1 = ctx.getBean(serviceImp.class);
        DataSource source = ctx.getBean(DataSource.class);


        imp.test();
        imp1.test();

        System.out.println(source.toString());


    }


}
