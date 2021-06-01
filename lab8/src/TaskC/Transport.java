package TaskC;

public interface Transport {
    default void go() {
        System.out.print("vroom vroom vroom ");
    }

    default void honk() {
        System.out.print("beep beep beep ");
    }
}
