package chp09;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Jeong");

        names.set(1, "Cha");

        String removedName = names.remove(2);

        System.out.println("삭제된 요소 : " + removedName);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}