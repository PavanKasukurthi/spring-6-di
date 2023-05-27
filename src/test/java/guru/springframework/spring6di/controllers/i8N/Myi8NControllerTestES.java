package guru.springframework.spring6di.controllers.i8N;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("ES")
@SpringBootTest
class Myi8NControllerTestES {

    @Autowired
    Myi8NController myi8NController;
    @Test
    void sayHello() {
        System.out.println(myi8NController.sayHello());
    }
}