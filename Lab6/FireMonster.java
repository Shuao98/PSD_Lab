public class FireMonster extends Monster{
    private boolean nextDodge;
    public FireMonster(int hit_pts, int attack_pts){
        super("Fire", hit_pts, attack_pts, new String[]{"Water"});
        this.nextDodge =true;

    }
    protected boolean dodge() {
        boolean result = nextDodge;
        nextDodge = !nextDodge; // flip each time
        return result;
    }
   
}
