package com.ruairi.nea2026;

import javafx.scene.image.Image;

public class FrameController {
    private int currentFrame;
    private Image[] frames;

    public Image getCurrentFrame(){
        return frames[currentFrame];
    }

}
