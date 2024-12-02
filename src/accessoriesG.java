public class accessoriesG implements accessories{
    protected int level = 1;
    protected int damage;

    public accessoriesG(int damage) {
        this.damage = damage;
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println("level up");
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
