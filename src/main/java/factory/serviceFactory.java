package factory;

import org.springframework.beans.factory.FactoryBean;
import service.imp.serviceImp;

public class serviceFactory implements FactoryBean<serviceImp> {
    @Override
    public serviceImp getObject() throws Exception {
        System.out.println("factory");
        return new serviceImp();
    }

    @Override
    public Class<?> getObjectType() {
        return serviceImp.class;
    }
}
