package homework;

public class Woman extends People {

    Woman(int height, int studentId) {
        super("Woman", height, studentId);
    }

    @Override
    public int compareTo(People o) {
        if (!this.sex.equals(o.sex)) {
            return 1;
        }
        return this.studentId - o.studentId;
    }
}
