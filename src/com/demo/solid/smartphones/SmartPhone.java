package com.demo.solid.smartphones;



import com.demo.solid.mobiles.Phones;

public  class SmartPhone extends Phones implements SmartPhones
{
    @Override
    public void capture()
    {
        System.out.println("\t\tSmartPhones\nsmart phone can capture videos and pictures");
    }
}


