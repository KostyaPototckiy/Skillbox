public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(40, 8, "Intel", 10);
        RAM ram = new RAM("DDR", 256, 15);
        HardDisk hardDisk = new HardDisk("SSD", 512, 15);
        Screen screen = new Screen(20, "IPS", 15);
        Keyboard keyboard = new Keyboard("For Games", true, 5);

        Computer computer = new Computer("ASUS", "RX356");

        System.out.println(computer);
    }
}
