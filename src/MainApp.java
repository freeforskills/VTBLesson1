import Animals.*;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Animals[] msv = {
            new Cat("Барсик"), new Cat("Мурзик"),
            new Dog("Шарик"), new Dog("Бобик"),
            new Tiger("Шерхан"), new Tiger("Тигруля"),
            new Fish("Дори"), new Fish("Немо"),
            new Cat("Кошак")
    };
        Arrays.sort(msv);

    for (Animals o:msv) {
        o.run(50);
        o.swim(5);
        System.out.println();
    }
        Animals.getInfo();

    }
}
