package com.demo.solid.mobiles;
public abstract class Phones implements Mobiles
{
    @Override
    public void communicate()
    {
        System.out.println("\t\t PHONES\nphones can communicate through calls or messages");
    }


}
