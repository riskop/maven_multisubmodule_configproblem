package hu.risko.plugin.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("hu.risko.plugin")
public class CommonConfig {

    @Bean(name = "commonMapper")
    public ModelMapper getModelMapper() {
        System.out.println("getModelMapper COMMON");
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
}
