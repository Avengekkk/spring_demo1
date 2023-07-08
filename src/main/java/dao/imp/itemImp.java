package dao.imp;

import dao.itemIner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository(value = "itemImp")
public class itemImp implements itemIner {

    @Value("${jdbc.age}")
    private int num;

    @Value("${jdbc.name}")
    private String name;

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("this is a itemImp test");
        System.out.println("num: " + num);
        System.out.println("name: " + name);


    }
}
