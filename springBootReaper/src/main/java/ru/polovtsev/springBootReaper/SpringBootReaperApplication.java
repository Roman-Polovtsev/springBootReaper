package ru.polovtsev.springBootReaper;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootReaperApplication {

    /**
     * @param args Использую билдер, потому что вылетало HeadlessException при попытке создания попАпа на запрос
     *             создания бина моего стартера, использовал для фикса спсособ:
     * @link https://stackoverflow.com/questions/51004447/spring-boot-java-awt-headlessexception/52294064
     */
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootReaperApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }

    @Bean
    public ApplicationListener applicationListener() {
        return (event -> System.out.println("Now you can see 'overriding' of starter's applicationListener bean" +
                " by manually written bean of class ApplicationListener, current event = " + event));
    }

}
