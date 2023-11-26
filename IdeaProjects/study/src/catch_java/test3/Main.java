package catch_java.test3;

public class Main {
    public static void main(String[] args) {

        Unit unit_up;
        Unit my_unit;
        Zealot zealot = new Zealot();

        unit_up = zealot; // 업캐스팅

        Zealot myzealot = new Zealot();
        my_unit = myzealot;
        Zealot unit1 = (Zealot) my_unit;


        // * 다운캐스팅(downcasting) - 자식 전용 멤버를 이용하기위해, 이미 업캐스팅한 객체를 되돌릴때 사용
        Zealot unit_down = (Zealot) unit_up; // 캐스팅 연산자는 생략 불가능. 반드시 기재
        unit_down.attack(); // "찌르기"
        unit_down.teleportation(); // "프로토스 워프"
        unit1.attack();;
    }
}
