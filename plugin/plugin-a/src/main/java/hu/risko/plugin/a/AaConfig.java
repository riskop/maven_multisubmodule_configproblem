package hu.risko.plugin.a;

import hu.risko.plugin.common.CommonConfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AaConfig extends CommonConfig {

    @Bean(name = "aMapper")
    public ModelMapper getModelMapper() {
		System.out.println("getModelMapper AAAAAAAAAAAA");
    	ModelMapper modelMapper = new ModelMapper();
	    return modelMapper;
    }

}
