public class amuletOfFire extends accessoriesG{
    public amuletOfFire(int damage) {
        super(damage);
    }

    public void fire(character target) {
        target.addAtk(10);
    }
}
