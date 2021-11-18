public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        if(this.level == 1){
            this.health += (this.health * 10) / 100;
        }else if(this.level == 2){
            this.health += (this.health * 30) / 100;
        }else if(this.level == 3){
            this.health += (this.health * 40) / 100;
        }
    }
    
    public String getZombieInfo(){
        String text = "Walking Zombie Data = \nHealth = "+this.health+"\nLevel = "+this.level;
        return text;
    }
    
    public void destroyed() {
        this.health -= (this.health * 20) / 100;
    }
}