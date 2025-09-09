package com.ruairi.nea2026;

import javafx.scene.image.Image;

public class FrameController {
    private int currentIndex;
    private Image[] frames;

    public Image getCurrentFrame(double currentTime){
        return frames[currentIndex];
    }

}
