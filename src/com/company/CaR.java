package com.company;

public class CaR implements Soundable {

    class CarWheel {
        private String material;
    }

    private String name;
    private int maxspeed;
    protected String bbb;
    public Wheel[] wheels;
    public CarWheel carWheel;


    public CaR(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public void beep(Sound sound) {

    }
}
