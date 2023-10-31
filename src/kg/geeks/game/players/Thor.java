package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class Thor extends Hero{
    private int bossDefaultDamage;
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    public int getBossDefaultDamage() {
        return bossDefaultDamage;
    }

    public void setBossDefaultDamage(int bossDefaultDamage) {
        this.bossDefaultDamage = bossDefaultDamage;
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        /*setBossDefaultDamage(50);
        if (boss.getDamage() == 0){
            boss.setDamage(this.getBossDefaultDamage());
        }
        boolean attack = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0) {
                if (attack) {
                    boss.setDamage(0);
                    System.out.println("Thor stunned the boss " + attack);
                    break;
                }
                else {
                    boss.getDamage();
                    break;
                }
            }
        }*/
        Random thor = new Random();
        boolean stun = thor.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (stun){
                boss.setDamage(0);
                System.out.println("Thor stunned BOSS!");
                break;
            } else{
                boss.setDamage(50);
                break;
            }
        }
    }
}
