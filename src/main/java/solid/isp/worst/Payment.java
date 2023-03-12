package solid.isp.worst;

public interface Payment {

    void deposit();

    void withdraw();

    // 해당 메소드는 토스에는 필요 없는 메소드 이다.
    // 그래서 토스를 구현할때 쓸데없는 구현을 해야하는 일이 발생한다.
    // This method is not existed at first implementation
    // But added it later
    void giveShinHanPoint();

}
