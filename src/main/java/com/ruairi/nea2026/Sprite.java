package com.ruairi.nea2026;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;


public abstract class Sprite {
    public Hitbox hitbox;
    public FrameController frameController;
    public State CurrentState;
    public Direction currentDirection;
    public ImageView imageView;

    float posX, posY;
    float velocityX, velocityY;
    boolean visibility;

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
    public void render(double secondsElapsed, Direction oldDirection){
        imageView.setImage(frameController.getCurrentFrame(secondsElapsed));
        if (currentDirection != oldDirection){
            imageView.setScaleX(-1);
        }
    };

    public void setCurrentState(State currentState, Direction direction) {
        CurrentState = currentState;
        currentDirection = direction;
    }

    public void setCurrentState(State currentState){
        CurrentState = currentState;
    }


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

    public Hitbox getHitbox(){
        return hitbox;
    }

    public boolean isVisible() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }


}
