package practice.extends1.super2;

public class ClassC extends ClassB {

    public ClassC(int a) {
//        super();
        super(a, 0);
        System.out.println("ClassC 생성자");
    }

    /*
     * super()는 무조건 메서드 최상단에서 호출을 강제한다.
     *
     * 그러나 생성자를 여러 개 만들고 super() 대신 this()를 통해 다른 생성자를 호출하고
     * 호출된 생성자 최상단에서 super()를 호출한다면
     * 이 경우에는 super() 대신 this()를 최상단에 쓰는 것처럼 보이게 할 수는 있다.
     *
     * 기본 생성자가 이미 정의 되어 있으면 생성 불가능하다.
     * 대신 정의된 생성자에 맞게 직접 생성 해주어야 한다.
     *
     * 즉, 기존 생성자를 사용 또는 생략 시키려면 생성자가 직접 정의되어 있지 않은 경우에만 가능하다.
     * */
}
