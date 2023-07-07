package example;

import dao.imp.itemImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.imp.serviceImp;

public class App {


    public static void main(String[] args) {


        test01();


    }


    public static void test01() {

        //从pom配置文件的依赖来获得IOC容器
        //利用spring-config让XML文件中的元素(bean)来与容器建立联系
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取容器中的元素
        serviceImp imp1= (serviceImp) ctx.getBean("serviceFactory");
        serviceImp imp2= (serviceImp) ctx.getBean("serviceFactory");

        System.out.println(imp1);
        System.out.println(imp2);


    }


}
