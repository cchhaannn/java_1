package practice.oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valudData = new ValueData();
        valudData.add();
        valudData.add();
        valudData.add();
        System.out.println("최종 숫자=" + valudData.value);
    }
}
