package solid.isp.best;

public interface ShinhanPayment extends Payment {

    // 처음에 Payment를 구현할때 토스와 신한에 공통된 입출금만 지원했는데 갑자기 신한에서 자기들 포인트를
    // 지급해주는 기능을 추가해달라고 해서 아래의 메서드를 후에 추가하게 됐다.
    // This method is not existed at first implementation
    // But added it later
    void giveShinHanPoint();

}
