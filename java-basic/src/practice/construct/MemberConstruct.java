package practice.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    // 생성자는 프로그램에 하여금 요소를 넣도록 강제한다
    // 요소를 넣지 않을 경우 컴파일 에러가 발생한다
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
