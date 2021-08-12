public class Computer {
    private CPU cpu; // Процессор
    private RAM ram; // Оперативная память
    private HardDisk hardDick; // Жесткий диск
    private Screen screen; // Экран
    private Keyboard keyboard; // Клавиатура

    private final String vendor; // Производитель
    private final String name; // Название


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HardDisk getHardDick() {
        return hardDick;
    }

    public void setHardDick(HardDisk hardDick) {
        this.hardDick = hardDick;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int getTotalWeight() {
        return CPU.getWeight() + RAM.getWeight() + HardDisk.getWeight()
                + Screen.getWeight() + Keyboard.getWeight();
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Название: " + getName() + "\n"
                + "Процессор: " + CPU.getAllInformation() + "\n"
                + "Оперативная память: " + RAM.getAllInformation() + "\n"
                + "Жесткий диск: " + HardDisk.getAllInformation() + "\n"
                + "Экран: " + Screen.getAllInformation() + "\n"
                + "Клавиатура: " + Keyboard.getAllInformation() + "\n"
                + "Общий вес компьютера: " + getTotalWeight();
    }
}