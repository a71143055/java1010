package chp10;

public class Knight extends Novice {
    int stamina;
    void slash() {
        System.out.printf("%s(HP : %d, ST : %d)의 슬래쉬!!\n", name, hp, stamina);
    }
}