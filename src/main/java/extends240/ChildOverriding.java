package extends240;

public class ChildOverriding extends ParentOverriding {

    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    public String printName() {
        System.out.println("printName() - ChildOverriding");
    }
}
