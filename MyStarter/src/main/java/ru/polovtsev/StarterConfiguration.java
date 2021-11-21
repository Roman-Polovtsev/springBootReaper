package ru.polovtsev;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.polovtsev.conditional.ConditionalOnPopUpWindow;
import ru.polovtsev.properties.Properties;

@Configuration
@EnableConfigurationProperties(Properties.class)
public class StarterConfiguration {

    @ConditionalOnPopUpWindow
    @ConditionalOnProperty("starter.message")
    @ConditionalOnMissingBean(ApplicationListener.class)
    @Bean
    Listener listener(Properties properties) {
        return new Listener(properties);
    }
}
