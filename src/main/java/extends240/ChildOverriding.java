package extends240;

public class ChildOverriding extends ParentOverriding {

    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    private void printName() {
        System.out.println("printName() - ChildOverriding");
    }
}
