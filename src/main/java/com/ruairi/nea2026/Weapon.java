package com.ruairi.nea2026;

public abstract class Weapon {
    int maxAmmo;
    int currentAmmo;
    int ammoReserves;

    public void reload(){
        if (ammoReserves>=maxAmmo){
            currentAmmo = maxAmmo;
        }
        else{
            currentAmmo = ammoReserves;
        }
        ammoReserves -= maxAmmo;
    }

    public abstract void attack();
}
