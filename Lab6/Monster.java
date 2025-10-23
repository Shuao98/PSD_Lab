public abstract class Monster {
    private String type;
    private int hit_pts;
    private int attack_pts;
    private String[] weaknesses;

    public Monster() {
    }

    public Monster(String type, int hit_pts, int attack_pts, String[] weaknesses) {
        this.type = type;
        this.hit_pts = hit_pts;
        this.attack_pts = attack_pts;
        this.weaknesses = weaknesses;
    }

    public String getType() {
        return type;
    }

    public int getHitPoints() {
        return hit_pts;
    }

    public int getAttackPoints() {
        return attack_pts;
    }

    public String[] getWeaknesses() {
        return weaknesses;
    }

    public boolean isWeakAgainst(String otherType) {
        for (String w : weaknesses) {
            if (otherType.equals(w)) {
                return true;
            }
        }
        return false;
    }

    public void removeHitPoints(int pointsToRemove) {
        this.hit_pts = this.hit_pts - pointsToRemove;
        if (this.hit_pts < 0) {
            this.hit_pts = 0;
        }
    }

    public boolean attack(Monster otherMonster) {
        if (otherMonster == this) {
            return false;
        } else if (otherMonster.hit_pts == 0 | this.hit_pts == 0) {
            return false;
        }
        //Task 5 dodged
        boolean dodged = otherMonster.dodge();
         if (dodged) {
            // Opponent dodged — attacker loses 10 HP
            this.removeHitPoints(10);
            System.out.println(this.getType() + " attacked but " + otherMonster.getType() + " dodged! "
                    + this.getType() + " loses 10 HP!");
            return true;
        }
        //------End Task 5 Dodged
        // Determine damage
        int damage = this.attack_pts;
        if (otherMonster.isWeakAgainst(this.type)) {
            damage += 20; // extra damage if the other monster is weak
        }

        // Apply damage
        otherMonster.removeHitPoints(damage);
        return true;

    }

    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", hitPoints=" + hit_pts +
                ", attackPoints=" + attack_pts +
                '}';
    }
    //Task 5
    protected abstract boolean dodge();
}

