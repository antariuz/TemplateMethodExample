package model;

public abstract class MobilePhone {
    protected abstract void airplaneMode();
    protected abstract void muteMode();
    public void fullSilenceMode(){
        airplaneMode();
        muteMode();
    }
}
