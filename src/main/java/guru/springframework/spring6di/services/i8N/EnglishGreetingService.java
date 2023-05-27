package guru.springframework.spring6di.services.i8N;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Service("i8NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
