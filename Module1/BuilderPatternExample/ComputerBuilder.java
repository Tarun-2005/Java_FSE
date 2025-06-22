package Module1.BuilderPatternExample;

public class ComputerBuilder {
    private final String CPU;
    private final String RAM;
    private final String Storage;
    private String bluetooth;
    private String integratedGraphicsCard = "NVIDIA GTX 1650"; 
    public ComputerBuilder(String CPU, String RAM, String Storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.Storage = Storage;
    }
    public ComputerBuilder enableBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }
    public ComputerBuilder setIntegratedGraphicsCard(String integratedGraphicsCard) {
        this.integratedGraphicsCard = integratedGraphicsCard;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM, Storage, bluetooth, integratedGraphicsCard);
    }
}
