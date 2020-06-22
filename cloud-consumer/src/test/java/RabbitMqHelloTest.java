import com.chen.springcloud.OrderApp;
import com.chen.springcloud.mq.send.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname RabbitMqHelloTest
 * @Description TODO
 * @Date 2020/6/9 9:04
 * @Created by ChenHao
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderApp.class})
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {

        for (int i = 0; i < 10; i++) {
            helloSender.send();
        }
    }
}
