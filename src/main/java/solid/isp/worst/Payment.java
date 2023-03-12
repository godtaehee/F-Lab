package solid.isp.worst;

public interface Payment {

    void deposit();

    void withdraw();

    // This method is not existed at first implementation
    // But added it later
    void giveShinHanPoint();

}
