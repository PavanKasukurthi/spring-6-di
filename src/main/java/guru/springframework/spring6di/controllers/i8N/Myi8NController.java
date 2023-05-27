package guru.springframework.spring6di.controllers.i8N;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi8NController {

    private final GreetingService greetingService;

    public Myi8NController(@Qualifier("i8NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
