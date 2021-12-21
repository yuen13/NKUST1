public class Role {
    int HP;
    int MP;
    int ATK;

    Role(int roleHP, int roleMP, int roleATTACK) {
        HP = roleHP;
        MP = roleMP;
        ATK = roleATTACK;
    }
    void getCurrentStatus() {
        System.out.println("HP:" + HP);
        System.out.println("MP:" + MP);
        System.out.println("ATTACK:" + ATK);
    }
}
