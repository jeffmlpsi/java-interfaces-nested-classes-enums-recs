package jif;

// a class that is marked as final cannot be extended
public final class Bass implements MakesSound {
    private String sound;

    public Bass() {
        this.sound = "Bass-Dum";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String s) {
        this.sound = s;
    }   

}
