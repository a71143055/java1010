package chp10;

public class RPGGameTest {
    public static void main(String[] args) {
        Wizard w1 = new Wizard();
        w1.name = "간달프";
        w1.hp = 100;
        w1.mp = 80;
        w1.punch();
        w1.fireball();
    }
}
