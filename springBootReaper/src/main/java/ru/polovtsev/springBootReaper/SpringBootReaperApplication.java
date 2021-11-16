package ru.polovtsev.springBootReaper;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
        builder.run(args);
//		ConfigurableApplicationContext context = SpringApplication.run(SpringBootReaperApplication.class, args);
    }

}
