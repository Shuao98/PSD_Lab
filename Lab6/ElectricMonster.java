public class ElectricMonster extends Monster{
    // private boolean nextDodge;
    public ElectricMonster(int hit_pts, int attack_pts){
        super("Electric", hit_pts, attack_pts, new String[]{});
        // this.nextDodge =true;

    }
    protected boolean dodge() {
        return false;
    }
   
}