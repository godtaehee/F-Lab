package solid.lsp.best;

import solid.ocp.best.Human;

public class Main {

    public static void main(String[] args) {

        // 아빠와 딸은 닮은 구석은 있지만 딸이 아빠가 될수는 없고 아빠도 딸이 될수 없다.
        // 둘의 공통점인 사람이라는 것으로 추상화를 해주면 좋다.
        Human father = new Father();
        Human daughter = new Daughter();

    }

}
