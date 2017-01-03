package Projects;

import java.util.Random;

public class DeepJellyfish {
    private String moniker;
    private Integer tentacles;
    private Boolean sting;
    private Integer cunning;
    private double speed;

    Random rJellyfish = new Random();
    int rJTentacles = rJellyfish.nextInt(10) + 1;
    boolean rJInk = rJellyfish.nextBoolean();
    int rJCunning = rJellyfish.nextInt(10) + 1;
    double rJSpeed1 = (Math.random() * ((9 - 1) + 1) + 1);
    double rJSpeed = Math.round(rJSpeed1*100/100.00);

    DeepJellyfish() {

        setMoniker("Jellyfish");
        setTentacles(rJTentacles);
        setSting(rJInk);
        setCunning(rJCunning);
        setSpeed(rJSpeed);

        getMoniker();
        getTentacles();
        getSting();
        getCunning();
        getSpeed();
    }

    public String getMoniker() {
        return moniker;
    }

    public void setMoniker(String moniker) {
        this.moniker = moniker;
    }

    public Integer getTentacles() {
        return tentacles;
    }
    public void setTentacles(Integer tentacles) {
        this.tentacles = tentacles;
    }
    public Boolean getSting() {
        return sting;
    }
    public void setSting(Boolean sting) {
        this.sting = sting;
    }
    public Integer getCunning() {
        return cunning;
    }
    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}