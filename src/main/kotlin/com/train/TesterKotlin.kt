package com.train

import com.train.controller.ControllerKT
import com.train.exception.InputDataExceptionKT

fun main(args: Array<String>) {
    try {
        ControllerKT().printQuestion()
    }catch (e:Exception){
        InputDataExceptionKT(e.message).printStackTrace()

    }

}