package TaskC;

public class Main {
    public static void main(String[] args) {
        Tram tram = new Tram("city", 50, "regular");
        System.out.print("Tram ride: ");
        tram.go();
        System.out.print("Tram said: ");
        tram.honk();
    }
}
