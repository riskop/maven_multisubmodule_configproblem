package hu.risko.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {

    @Qualifier("commonMapper")
    @Autowired()
    ModelMapper modelMapper;
}
