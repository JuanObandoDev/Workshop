package ejerciciosSegundoCorte.ejercicio9;

public class main {
    public static void main(String[] args) {
        auto car1 = new auto("ABC123", "Toyota", "Corolla", "White", 20000000, 4, 10000, true, false, true);
        System.out.println(car1.toString());
        System.out.println(car1.turnOn());
        System.out.println(car1.startUp());
        System.out.println(car1.accelerate());
        System.out.println(car1.turnLeft());
        System.out.println(car1.brake());
        System.out.println(car1.turnRight());
        System.out.println(car1.accelerate());
        System.out.println(car1.changeGear());
        System.out.println(car1.brake());
        System.out.println(car1.changeGear());
        System.out.println(car1.stop());
        System.out.println(car1.turnOff());
    }
}
