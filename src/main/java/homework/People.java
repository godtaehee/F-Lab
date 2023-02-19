package homework;

public abstract class People implements Comparable<People> {

    protected String sex;

    People(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sex: " + this.sex + "\n";
    }
}
