package com.ferrari.formula1_team.exception;

import com.ferrari.formula1_team.enums.ExceptionMessageEnum;

public class DriverNotFoundException extends RuntimeException{

     public DriverNotFoundException(){
         super(ExceptionMessageEnum.DRIVER_NOT_FOUND_EXCEPTION.name());
     }

}
