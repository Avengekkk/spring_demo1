package configration;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"dao","service"})
@PropertySource("classpath:jdbc.properties")
@Import({otherConfig.class})
public class config {



}
