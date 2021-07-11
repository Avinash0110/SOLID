package com.demo.solid.smartphones;


public class SamsungSmartPhone implements SamsungNewFeatures
{
    @Override
    public void Flip(String feature)
    {
        System.out.println("samsung launched a flip smartphone called "+feature);
    }

}
