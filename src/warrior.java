public class warrior extends characterG {
    public warrior(String name) {
        super(name);
    }

    public void lastStand() {
        if (hp <= 40){
            atk += 20;
            System.out.println("My atk = " + hp);
        }
    }
}
