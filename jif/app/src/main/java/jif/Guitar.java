package jif;

public class Guitar implements MakesSound {
    private String sound;

    public Guitar() {
        this.sound = "Guitar-Strum";
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
