package com.example.hdemo;

//import lombok.Value;
import org.springframework.beans.factory.annotation.Value;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    @Value("${age}")
    private  int age;
    @Value("${name}")
    private String name;
    @Test
    public void getAge()
    {
        System.out.println(age);
    }
    @Test
    public void getName(){
        System.out.println(name);
    }

}
