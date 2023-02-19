package homework;

public abstract class People implements Comparable<People> {

    String sex;
    int height;
    int studentId;

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
