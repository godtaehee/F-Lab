package homework;

public class Man extends People {
    private int height;

    Man(int height) {
        super("Man");
        this.height = height;
    }

    @Override
    public int compareTo(People o) {
        if (o instanceof Man) {
            return this.height - ((Man) o).height;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.sex + " Height: " + this.height + '\n';
    }
}
