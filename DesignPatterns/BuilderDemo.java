package DesignPatterns;

class Car {
    private String engine;
    private int wheels;
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
    }
    public static class CarBuilder {
        private String engine;
        private int wheels;
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
    public void showCar() {
        System.out.println("Car with Engine: " + engine + ", Wheels: " + wheels);
    }
}
public class BuilderDemo {
    public static void main(String[] args) {

        Car car =new Car.CarBuilder().setEngine("V8").setWheels(4).build();
        car.showCar();

    }}
;

