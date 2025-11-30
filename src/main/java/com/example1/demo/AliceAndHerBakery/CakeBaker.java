package com.example1.demo.AliceAndHerBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    private Syrup syrup;

    @Autowired
    private Frosting frosting;

    public void bakeCake(){
        System.out.println("Cake has been cooked with frosting "+ frosting.getFrostingType()
        +" and syrup "+ syrup.getSyrupType());
    }
}
