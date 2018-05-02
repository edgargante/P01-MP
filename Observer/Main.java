public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Torteria torteria = new Torteria();

        Torteria1 t1 = new Torteria1(torteria);
        Torteria2 t2 = new Torteria2(torteria);
        Torteria3 t3 = new Torteria3(torteria);



        torteria.setTorteria("Torta Sencilla", 22, 1000);
        torteria.setTorteria("Torta Integral", 44, 1500);
        torteria.setTorteria("Torta Sencilla", 50, 1600);

    }
}
