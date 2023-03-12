package solid.isp.worst;

public class Toss implements Payment {

    public void deposit() {

    }

    public void withdraw() {

    }

    // 구현을 할 필요가 없으니, 구현부를 비워놓을수도 있지만 그렇게되면 이게 왜 있는지
    // 동료 개발자에게 알릴수가 없다. 그래서  그나마 에러처리를 적용해놨지만
    // 결국 쓰레기 코드이다.
    public void giveShinHanPoint() {

        throw new Error("NOT IMPLEMENTED");

    }

}
