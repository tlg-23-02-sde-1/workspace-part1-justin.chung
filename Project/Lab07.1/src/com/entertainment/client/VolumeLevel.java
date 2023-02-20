package com.entertainment.client;

public enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private int volume;

    VolumeLevel(int volume) {
        this.volume = volume;
    }

    public int Volume() {
        return volume;
    }
}