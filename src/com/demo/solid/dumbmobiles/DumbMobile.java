package com.demo.solid.dumbmobiles;

import com.demo.solid.mobiles.Phones;

public class DumbMobile extends Phones implements DumbMobiles
{
    @Override
    public void physicalKeyPad()
    {
        System.out.println("\t\tDUMB MOBILES\nDumb mobiles can communicate through calls or messages");
    }
}
