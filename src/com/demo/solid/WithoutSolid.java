package com.demo.solid;

interface Mobiles
{
    void communicate();
    void physicalKeyPad();
    void capture();

}

class Phones implements Mobiles
{
    @Override
    public void communicate()
    {
        System.out.println("\t\tMOBILES\nphones can communicate through calls or messages");
    }
    @Override
    public void physicalKeyPad()
    {
        System.out.println("dumb mobile contain full keypad");
    }
    @Override
    public void capture()
    {
        System.out.println("Smart phone can capture pictures and videos");
    }
}
class SamsungSmartPhone extends Phones
{
    public void galaxySeries()
    {
        System.out.println("Samsung has following series\n1. samsungGalaxy M-series\n2. samsungGalaxy A-series\n3. samsungGalaxy S-series");
    }
    public void zFlip()
    {
        System.out.println("Samsung has new featured mobile called Z flip mobile");
    }


}
class KarbonMobile extends Phones
{

    public void lightsKeyPad()
    {
        System.out.println("karbon has keypad with lights");
    }
    public void karbonSeries()
    {
        System.out.println("karbon has only K-series");
    }
}

public class WithoutSolid
{
    public static void main(String[] args)
    {
        SamsungSmartPhone smartphone_obj = new SamsungSmartPhone();
        smartphone_obj.communicate();
        smartphone_obj.capture();
        smartphone_obj.galaxySeries();
        smartphone_obj.zFlip();
        KarbonMobile dumbmobile_obj=new KarbonMobile();
        dumbmobile_obj.communicate();
        dumbmobile_obj.physicalKeyPad();
        dumbmobile_obj.lightsKeyPad();
        dumbmobile_obj.karbonSeries();


    }
}