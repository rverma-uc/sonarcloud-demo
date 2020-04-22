package com.upchain.demointegration.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "This is a demo app to test dev tools integration.";
    }

    public String helper(){
        return "";
    }

    public String helper2(){
        double rand = Math.random();
        if(rand > 0.01){
            return Double.toString(rand);
        } else if(rand > 0.01){
            return Double.toString(rand);
        } else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        }else if(rand > 0.01){
            return Double.toString(rand);
        } else {
            return Double.toString(rand);
        }
    }
}
