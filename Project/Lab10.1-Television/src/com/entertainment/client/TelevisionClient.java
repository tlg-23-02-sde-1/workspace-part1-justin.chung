package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

class TelevisionClient {
    // Starting point for any standalone Java application
    public static void main(String[] args) throws Exception {
        Television tv = null;
        try {
            Television tv1 = new Television();
            System.out.println(tv1.getInstanceCount());
            Television tv2 = new Television();
            System.out.println(tv2.getInstanceCount());

            tv1.setBrand("SamsungWrong");
            System.out.println("Your TV brand is: " + tv1.getBrand());
            tv1.setVolume(101);
            tv1.increaseBrightness(100);
            tv1.turnOn();
            tv1.turnOff();

            System.out.println("\n");

            tv2.setBrand("Sony");
            System.out.println("Your TV brand is: " + tv2.getBrand());
            tv2.increaseVolume(32);
            tv2.increaseBrightness(120);
            tv2.turnOn();
            tv2.turnOff();

            tv = new Television("Sony", 40);
            System.out.println(tv);
            tv.setDisplay(DisplayType.LCD);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        catch (InvalidBrandException e) {
            System.out.println(" ERROR: " + e);
        }
        System.out.println(tv);
    }
}
