package com.ruairi.nea2026;

public class EnemyController {
    public static void goToPoint(Enemy e, float moveSpeed, float pointX, float pointY){
        float deltaX = pointX - e.posX;
        float deltaY = pointY - e.posY;
        float deltaDist = (float) Math.sqrt(deltaX*deltaX + deltaY*deltaY);
        e.velocityX = moveSpeed*deltaX/deltaDist;
        e.velocityY = moveSpeed*deltaY/deltaDist;
    }
    public static void goToPoint(Enemy e, float moveSpeed, float pointX){
        goToPoint(e, moveSpeed, pointX, e.posY );
    }
}