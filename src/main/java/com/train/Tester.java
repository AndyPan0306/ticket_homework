package com.train;


import com.train.controller.Controller;
import com.train.exception.InputDataException;

public class Tester {
    public static void main(String[] args) {
        try {
            new Controller().printQuestion();
        }catch (Exception e){
            new InputDataException(e.getMessage()).printStackTrace();
        }

    }
}
