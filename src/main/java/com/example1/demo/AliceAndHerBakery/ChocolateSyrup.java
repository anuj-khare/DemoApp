package com.example1.demo.AliceAndHerBakery;

import lombok.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    @Override
    public String getSyrupType() {
        return new String("Chocolate");
    }
}