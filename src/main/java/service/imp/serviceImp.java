package service.imp;

import dao.imp.itemImp;
import dao.itemIner;
import service.serviceIner;

public class serviceImp implements serviceIner {


    //service中new了dao中的一个对象,与dao层耦合度太高
    //itemIner item=new itemImp();

    private itemImp item;

    @Override
    public void test() {
        System.out.println("this is serviceImp test in service ");
        item.test();

    }

    //写一个方法动态设置一个对象
    //之后在config文件中动态绑定对象
    public void setItem(itemImp item) {
        this.item = item;
    }
}
