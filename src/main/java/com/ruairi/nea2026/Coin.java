package com.ruairi.nea2026;

public class Coin {
    int value;
    public Coin(int value){
        super();
        this.value = value;
    }
    public void collect(){
        Main.score += value;
    }
}
