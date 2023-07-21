public class Try {
    public static void main(String[] args) {

        Engine toyota_engine = new Engine();
        Bike bike = new Bike(toyota_engine);

        System.out.println(toyota_engine);
        System.out.println(bike.getEngine());
        System.out.println(bike);

        bike = null;

        System.out.println(bike);
        System.out.println(toyota_engine);

    }
}
