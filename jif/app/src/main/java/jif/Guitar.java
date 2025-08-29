package jif;

// a class that is marked as final cannot be extended
public final class Guitar implements MakesSound {
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
