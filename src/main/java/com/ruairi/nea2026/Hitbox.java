package com.ruairi.nea2026;

public class Hitbox {
    float topLeftX, topLeftY, width, height;
    public Hitbox(float topLeftX, float topLeftY, float width, float height){
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.width = width;
        this.height = height;
    }
    public boolean isColliding(Hitbox other){
        return this.topLeftX < other.topLeftX + other.width && this.topLeftX + this.width > other.topLeftX && this.topLeftY < other.topLeftY + other.height && this.topLeftY + this.height > other.topLeftY;
    }
    public void setPosition(float x, float y){
        this.topLeftX = x;
        this.topLeftY = y;
    }
    public void setSize(float width, float height){
        this.width = width;
        this.height = height;
    }
    public void setSizeAndMoveUp(float width, float height){
        this.width = width;
        this.height = height;
        this.topLeftY -= height;
    }
}
