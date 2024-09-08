package practice.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다.
        Student[] students = new Student[2];
        students[0] = student1;     // 인스턴스(student1)가 아닌 인스턴스(student1)의 주소 값이 들어간다.
        students[1] = student2;     // 인스턴스(student2)가 아닌 인스턴스(student2)의 주소 값이 들어간다.

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
