package com.demo.solid;

import com.demo.solid.dumbmobiles.DumbMobile;
import com.demo.solid.dumbmobiles.KarbonMobile;
import com.demo.solid.dumbmobiles.KarbonNewFeatures;
import com.demo.solid.mobiles.Phones;
import com.demo.solid.smartphones.SamsungSmartPhone;
import com.demo.solid.smartphones.SmartPhone;

public class MainMobiles
{
    public static void main(String[] args)
    {
        //Dumb mobiles
        Phones phones_obj = new DumbMobile();
        phones_obj.communicate();
        DumbMobile dumb_obj = new DumbMobile();
        dumb_obj.physicalKeyPad();
        KarbonNewFeatures karbon_obj = new KarbonMobile();
        karbon_obj.lightsKeyPad();
        //Smart Phones
        Phones phone_obj = new SmartPhone();
        phone_obj.communicate();
        SmartPhone smartphone_obj = new SmartPhone();
        smartphone_obj.capture();
        SamsungSmartPhone samsung_obj = new SamsungSmartPhone();
        samsung_obj.Flip("Z-Flip");
    }
}