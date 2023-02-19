package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<People> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            int height = 160 + (int)(random * 20);
            if (random > 0.5) {
                arrayList.add(new Man(height, i));
            } else {
                arrayList.add(new Woman(height, i));
            }
        }

        System.out.println(arrayList);
        arrayList.sort(Comparator.comparing((a) -> a));
        System.out.println("AFTER");
        System.out.println(arrayList);

    }
}