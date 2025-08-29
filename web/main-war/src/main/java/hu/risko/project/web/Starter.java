package hu.risko.project.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ComponentScan(basePackages = {
        "hu.risko",
})
public class Starter extends SpringBootServletInitializer {

    private final static Logger LOG = LoggerFactory.getLogger(Starter.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return configureApplication(applicationBuilder);
    }

    public static void main(String[] args) {
        configureApplication(new SpringApplicationBuilder()).run(args);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder applicationBuilder) {
        Map<String, Object> props = new HashMap<>();
        props.put("spring.main.allow-bean-definition-overriding", "true");
        applicationBuilder.properties(props);
        return applicationBuilder.sources(Starter.class);
    }
}
