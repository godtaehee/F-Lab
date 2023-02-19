package homework;

public class Man extends People {

    Man(int height, int studentId) {
        super("Man", height, studentId);
    }

    @Override
    public int compareTo(People o) {
        if (!this.sex.equals(o.sex)) {
            return -1;
        }
        return this.height - o.height;
    }
}
