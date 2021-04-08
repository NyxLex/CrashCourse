package com.task;

public abstract class Bird {
    private boolean featers;
    private boolean layeggs;

    public Bird() { }

    public Bird(boolean featers, boolean layeggs) {
        this.featers = featers;
        this.layeggs = layeggs;
    }

    public boolean isFeaters() {
        return featers;
    }

    public boolean isLayeggs() {
        return layeggs;
    }

    public void setLayeggs(boolean layeggs) {
        this.layeggs = layeggs;
    }

    public void setFeaters(boolean featers) {
        this.featers = featers;
    }
    public void fly() {
        System.out.println("Fly");

    }

}
