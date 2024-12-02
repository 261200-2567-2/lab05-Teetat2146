public interface character {
        void levelUp();
        void attack(character target);
        void takeDamage(int damage);
        void equip(accessories accessories);
        void drop(accessories accessories);
        void addHp(int hp);
        void addAtk(int atk);
        int getHp();
        int getAtk();
        String getName();

        int getHp(int hp);
}



