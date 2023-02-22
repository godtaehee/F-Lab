package callby;

public class Callby {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        System.out.println(aDog);
        System.out.println("aDog");
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max"));; // true
        System.out.println(aDog.getName().equals("Fifi"));; // false
        aDog = oldDog; // true

        if (aDog == oldDog) {
            System.out.println("같음");
        }

        int a = 3;

        callbyValue(a);
    }

    public static void foo(Dog d) {
        System.out.println("Before");
        System.out.println(d);

        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        System.out.println("After");
        System.out.println(d);
        d.getName().equals("Fifi"); // true
    }

    public static void callbyValue(int s) {
        System.out.println(s);
    }
}
