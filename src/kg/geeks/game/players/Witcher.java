package kg.geeks.game.players;

public class Witcher extends Hero{
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].equals("Doctor")){
                continue;
            } else if (heroes[i].getHealth()==0 && heroes[7].getHealth()>0) {
                heroes[i].setHealth(heroes[i].getHealth() + heroes[7].getHealth());
                heroes[7].setHealth(0);
                System.out.println("Witcher отдал жизнь " + heroes[i].getName());
                break;
            }
        }
    }

    public Witcher(int health, int damage, String name) {

        super(health, damage, name, SuperAbility.TREAT);
    }
}
