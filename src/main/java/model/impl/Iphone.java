package model.impl;

import model.MobilePhone;

public class Iphone extends MobilePhone {
    @Override
    protected void airplaneMode() {
        System.out.println("iPhone Airplane Mode is ON");
    }

    @Override
    protected void muteMode() {
        System.out.println("iPhone Mute Mode is ON");
    }
}
