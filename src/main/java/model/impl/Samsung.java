package model.impl;

import model.MobilePhone;

public class Samsung extends MobilePhone {

    @Override
    protected void airplaneMode() {
        System.out.println("Samsung Airplane Mode is ON");
    }

    @Override
    protected void muteMode() {
        System.out.println("Samsung Mute Mode is ON");
    }
}
