package practice.oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valudData = new ValueData();
        add(valudData);
        add(valudData);
        add(valudData);
        System.out.println("최종 숫자=" + valudData.value);
    }

    static void add(ValueData valudData) {
        valudData.value++;
        System.out.println("숫자 증가 value=" + valudData.value);
    }
}
