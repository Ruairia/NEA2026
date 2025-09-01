package com.ruairi.nea2026;


import java.util.ArrayList;

public class Hero extends Sprite{
    int health;
    Weapon currentWeapon;

    public Hero(float posX, float posY, float velocityX, float velocityY, float width, float height) {
        super(posX, posY, velocityX, velocityY, width, height);
        health=100;
    }

    public void jump(){
        //Handle logic for jumping
    }

    public void crouch(){

    }

    public void move(ArrayList<String> input){
        velocityX=0;
        if (input.contains("A")){
            velocityX-=1;
        }
        if (input.contains("D")){
            velocityX+=1;
        }
        if (input.contains("W")){
            jump();
        }
        else if (input.contains("S")){
            crouch();
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
