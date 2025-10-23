public class WaterMonster extends Monster{
    // private boolean nextDodge;
    public WaterMonster(int hit_pts, int attack_pts){
        super("Water", hit_pts, attack_pts, new String[]{"Fire","Electric"});
        // this.nextDodge =true;

    }
    protected boolean dodge() {
        if(this.getHitPoints()>=100) return true;
        return false;
    }
   
}
