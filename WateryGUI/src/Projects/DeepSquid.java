package Projects;

import java.util.Random;

public class DeepSquid {
    private String moniker;
    private Integer tentacles;
    private Boolean ink;
    private Integer cunning;
    private double speed;

    Random rSquid = new Random();
    int rSTentacles = rSquid.nextInt(10) + 1;
    boolean rSInk = rSquid.nextBoolean();
    int rSCunning = rSquid.nextInt(10) + 1;
    double rSSpeed1 = (Math.random() * ((9 - 1) + 1) + 1);
    double rSSpeed = Math.round(rSSpeed1*100/100.00);

    //Default constructor method
    DeepSquid() {
        setMoniker("Squid");
        setTentacles(rSTentacles);
        setInk(rSInk);
        setCunning(rSCunning);
        setSpeed(rSSpeed);

        getMoniker();
        getTentacles();
        getInk();
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

    public Boolean getInk() {
        return ink;
    }

    public void setInk(Boolean ink) {
        this.ink = ink;
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