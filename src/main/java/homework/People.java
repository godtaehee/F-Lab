package homework;

public abstract class People implements Comparable<People> {

    protected String sex;
    protected int height;
    protected int studentId;

    People(String sex, int height, int studentId) {
        this.sex = sex;
        this.height = height;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Sex: " + this.sex + " Height: " + this.height + " StudentId: " + this.studentId + "\n";
    }
}
