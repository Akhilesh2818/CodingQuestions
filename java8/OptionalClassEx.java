package java8;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClassEx {
    public static void main(String[] args) {
        Optional<String> obj=Optional.of(null);
        obj.ifPresent(System.out::println);
        obj.ifPresentOrElse(System.out::println,()-> System.out.println("unkown"));
        Supplier
    }
}
