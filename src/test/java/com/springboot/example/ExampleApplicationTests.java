package com.springboot.example;

import com.springboot.example.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleApplicationTests {

    @Autowired
    private Person person;


    @Test
    public void testConfigurationProperties() {
        System.out.println(person);
    }

    @Test
    public void testGetValueByValue(){
        System.out.println(person);
    }

}
