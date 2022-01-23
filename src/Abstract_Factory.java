import java.util.Scanner;

abstract class Factory {
    public abstract void input();

    public abstract void output();
}

class factory_1 extends Factory {
    public void input() {
        System.out.println("1번 공장이 수주받았음");
    }

    public void output() {
        System.out.println("1번 공장이 납품하였음");
    }
}

class factory_2 extends Factory {
    public void input() {
        System.out.println("2번 공장이 수주받았음");
    }

    public void output() {
        System.out.println("2번 공장이 납품하였음");
    }
}

class factory_3 extends Factory {
    public void input() {
        System.out.println("3번 공장이 수주받았음");
    }

    public void output() {
        System.out.println("3번 공장이 납품하였음");
    }
}

/**
class selectFactory {
    public Factory getFactory(int numFactory) {
        switch (numFactory) {
            case 1:
                new factory_1();
            case 2:
                new factory_2();
            case 3:
                new factory_3();
            default:
                return null;
        }
    }
}
*/

class selectFactory {
    public Factory getFactory(int numFactory) {
        // 향상된 switch 문
        return switch (numFactory) {
            case 1 -> new factory_1(); // return이 실행문인 경우 break 생략 가능
            case 2 -> new factory_2();
            case 3 -> new factory_3();
            default -> null;
        };
    }
}

public class Abstract_Factory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        selectFactory selectFactory = new selectFactory();
        Factory factory = selectFactory.getFactory(select);

        factory.input();
        factory.output();

        sc.close();
    }
}