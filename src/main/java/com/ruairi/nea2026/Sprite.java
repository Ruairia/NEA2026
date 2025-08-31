package com.ruairi.nea2026;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;


public abstract class Sprite {
    public Hitbox hitbox;
    public FrameController frameController;
    public State CurrentState;
    public ImageView imageView;

    float posX, posY;
    float velocityX, velocityY;
    boolean visibility;


    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public State getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(State currentState) {
        CurrentState = currentState;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public Sprite(float posX, float posY, float velocityX, float velocityY, float width, float height){
        this.posX=posX;
        this.posY=posY;
        this.velocityX=velocityX;
        this.velocityY=velocityY;
        hitbox = new Hitbox(posX, posY, width, height);
    }

    public Sprite(float posX, float posY, float width, float height){
        this(posX, posY, 0, 0, width, height);
    }

    public void update(double deltaSeconds){
        posX += (float) (velocityX * deltaSeconds);
        posY += (float) (velocityY * deltaSeconds);
    }
    public void render(GraphicsContext gc){
        imageView.setImage(frameController.getCurrentFrame());
    };
}
