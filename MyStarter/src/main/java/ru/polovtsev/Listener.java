package ru.polovtsev;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import ru.polovtsev.properties.Properties;

public class Listener implements ApplicationListener<ContextRefreshedEvent> {
    private final Properties properties;

    public Listener(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        properties.getMessage()
                .forEach(message ->
                System.out.println("Starter begins listen to context refreshed event with property message set as " + message));
    }
}
