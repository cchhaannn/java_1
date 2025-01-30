package practice.extends1.overriding;

public class ElectricCar extends Car {

    /**
     * 재정의 시 어노테이션이 반드시 필요한 것은 아니다.
     * 하지만 어노테이션이 있어야 컴파일 단계에서 오류를 잡아낼 수 있다.
     * */
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
