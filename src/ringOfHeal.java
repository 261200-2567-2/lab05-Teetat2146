public class ringOfHeal extends accessoriesG{
    public ringOfHeal(int damage) {
        super(damage);
    }

    public void heal(character target) {
        target.addHp(10);
    }
}
