package cart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwpCartApplicationTests {

    @Test
    void contextLoads() {
        if (1 == 1) {
            throw new IllegalArgumentException("1");
        }
    }

}
