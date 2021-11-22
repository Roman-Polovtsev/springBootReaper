package ru.polovtsev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * This class works during Environment building. It sets default profile by simple logic of
 * result of division to 2.
 */
public class ProfileEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (System.currentTimeMillis() % 2 == 0)
            environment.addActiveProfile("Lera");
        else environment.addActiveProfile("Roma");
    }
}
