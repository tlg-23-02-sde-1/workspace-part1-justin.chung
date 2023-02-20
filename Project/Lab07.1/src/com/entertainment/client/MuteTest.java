package com.entertainment.client;

import com.entertainment.Television;

class MuteTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.increaseVolume(50);
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.increaseVolume(25);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
    }
}