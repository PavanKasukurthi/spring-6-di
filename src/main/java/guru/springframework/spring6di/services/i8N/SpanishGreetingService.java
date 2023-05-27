package guru.springframework.spring6di.services.i8N;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("i8NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - ES";
    }
}
