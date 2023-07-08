package service.imp;

import dao.imp.itemImp;
import dao.itemIner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceIner;



@Service(value = "serviceImp")
public class serviceImp implements serviceIner {


    //service中new了dao中的一个对象,与dao层耦合度太高
    //itemIner item=new itemImp();


    @Autowired

    private  itemImp item;

    public serviceImp(itemImp item) {
        this.item = item;
    }

    @Override
    public void test() {
        System.out.println("this is serviceImp test in service ");
        item.test();

    }

    //写一个方法动态设置一个对象
    //之后在config文件中动态绑定对象

}
