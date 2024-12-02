import java.util.ArrayList;

public class characterG implements character {
    protected int hp = 100, level = 1, maxHp = 100, atk = 20;
    ArrayList<accessories> bag = new ArrayList<>();
    protected String name;

    characterG(String name) {
        this.name = name;
    }

    @Override
    public void levelUp() {
        level++;
        maxHp = 100+10*level;
        atk += level;
    }

    @Override
    public void attack(character target) {
        double totalDamage = 0;
        for (accessories item : bag) {
            totalDamage += item.getDamage();
        }
        totalDamage += atk;
        target.takeDamage((int) totalDamage);
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        hp = Math.max(0, hp);
        System.out.println(name + " takes " + damage + " damage. HP remaining: " + hp);
    }

    @Override
    public void equip(accessories accessories) {
        bag.add(accessories);
    }

    @Override
    public void drop(accessories accessories) {
        bag.removeLast();
    }

    @Override
    public void addHp(int hp) {
        this.hp = Math.min(this.hp + hp, this.maxHp);
        System.out.println(name + " current HP: " + this.hp);
    }

    @Override
    public void addAtk(int atk) {
        this.atk = Math.max(this.atk + atk, 0); // เพิ่ม HP โดยไม่เกิน maxHp
        System.out.println(name + " current atk: " + this.atk);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHp(int hp) {
        return 0;
    }

    public void heal() {
        for (accessories item : bag) {
            if (item instanceof ringOfHeal) {
                ((ringOfHeal) item).heal(this); //เรียกใช้ heal ไปทำความเข้าใจมา
                return;
            }
        }
        System.out.println(name + " does not have a Ring of Heal.");
    }

    public void fire() {
        for (accessories item : bag) {
            if (item instanceof amuletOfFire) {
                ((amuletOfFire) item).fire(this); // เรียกใช้ fire ไปทำความเข้าใจมา
                return;
            }
        }
        System.out.println(name + " does not have a amulet of Fire.");
    }

}
