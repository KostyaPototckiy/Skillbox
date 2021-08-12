public class Main {
    public static void main(Cargo cargo) {
        Cargo copy = new Cargo(cargo.getDimensions(), cargo.getWeight(), cargo.getAddres(),
                cargo.getProperty(), cargo.getRegNumber(), cargo.getFragility());
    }
}