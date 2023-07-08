package configration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import javax.swing.plaf.basic.BasicMenuUI;

public class otherConfig {



    @Bean
    public DataSource getDruid(){

        DruidDataSource druid=new DruidDataSource();


        druid.setUsername("root");
        druid.setPassword("87632190wh");


        return druid;
    }



}
