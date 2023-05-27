package guru.springframework.spring6di.controllers.i8N;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
//@ActiveProfiles("EN")
@SpringBootTest
class Myi8NControllerTestEN {
    @Autowired
    Myi8NController myi8NController;

    @Test
    void sayHello() {
        System.out.println(myi8NController.sayHello());
    }
}