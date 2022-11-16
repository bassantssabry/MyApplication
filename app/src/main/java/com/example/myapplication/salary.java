package com.example.myapplication;

public class salary {
    public double  employee(double _salary ,double _Holiday,double _taxes,double _Discount){
        double holidays_salary = (_salary /30)*_Holiday;
         double salary = (_taxes + _Discount + holidays_salary);
        return salary;
    }


}
