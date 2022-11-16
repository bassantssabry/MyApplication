package com.example.myapplication;

import android.widget.TextView;

public class calc {
    public double add (double _num1,double _num2){
        double z=_num1+_num2;
        return(z);
    }
    public double sub (double _num1,double _num2){
        double z=_num1-_num2;
        return(z);
    }
    public double mult (double _num1,double _num2){
        double z=_num1*_num2;
        return(z);
    }
    public double div (double _num1,double _num2){
        double z=_num1/_num2;
        return(z);
    }
    static double sqroot (double _num1){
        double z=Math.pow(_num1,0.5);
        return(z);
    }
    static double square (double _num1){
        double z=Math.pow(_num1,2);
        return(z);
    }
    static double cube (double _num1){
        double z=Math.pow(_num1,3);
        return(z);
    }




}


