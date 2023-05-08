package com.ferrari.formula1_team.exception;

public class DriverNotFoundException extends RuntimeException{

     public DriverNotFoundException(){
         //add enum
         super("Driver not found!");
     }

}
