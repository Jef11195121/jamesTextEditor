package farOutAtSea;

/**
 * Created by Jay on 10/10/16.
 */
public class Predator {
    private int aggression;
    private int vulnerability;
    private int attackLevel;
    private boolean camouflage;
    private int swag;
    private int speed;

public Predator(){
    setAggression(10);
    setVulnerability(9);
    setAttackLevel(8);
    setCamouflage(false);
    setSwag(7);
    setSpeed(6);
}

public void setAggression(int aggression){
    this.aggression = aggression;
}
public void setVulnerability(int vulnerability){
    this.vulnerability = vulnerability;
}
public void setAttackLevel(int attackLevel){
    this.attackLevel = attackLevel;
}
public void setCamouflage(boolean camouflage){
    this.camouflage = camouflage;
}
public void setSwag(int swag){
    this.swag = swag;
}
public void setSpeed(int speed){
    this.speed = speed;
}
//Get ----------------------------------------------------------- Get
public int getAggression() {
    return aggression;
}
public int getVulnerability(){
    return vulnerability;
}
public int getAttackLevel(){
    return attackLevel;
}
public boolean getCamouflage(){
    return camouflage;
}
public  int getSwag(){
    return swag;
}
public int getSpeed(){
    return speed;
}
}