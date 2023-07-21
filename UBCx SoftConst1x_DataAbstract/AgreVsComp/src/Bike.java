public class Bike {
    private Engine engine;

    @Override
    public String toString() {
        return "Bike{" +
                "engine=" + engine +
                '}';
    }

    public Bike(Engine engine){
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
