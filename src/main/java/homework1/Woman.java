package homework1;

public class Woman extends People {
    int studentId;

    public Woman(int studentId) {
        super("Woman");
        this.studentId = studentId;
    }

    @Override
    public int compareTo(People o) {
        if (o instanceof Woman) {
            return this.studentId - ((Woman) o).studentId;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return this.sex + " StudentId: " + this.studentId + '\n';
    }

    public int getStudentId() {
        return studentId;
    }
}
