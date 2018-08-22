package guru.springframework.di_demo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi - i was injected by constructor";
    }
}
