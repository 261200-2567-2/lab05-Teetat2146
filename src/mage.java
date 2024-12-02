public class mage extends characterG{
    public mage(String name) {
        super(name);
    }

    public void shieldOfTemplar() {
        if(hp<=30){
            hp += 30;
            System.out.println("My hp = " + hp);
        }
    }
}
