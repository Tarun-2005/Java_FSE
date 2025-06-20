package digitalnurture.BuilderPatternExample;
public class Computer {
    private final String CPU;
    private final String RAM;
    private final String Storage;
    private final String bluetooth;
    private final String integratedGraphicsCard;
    private Computer(String CPU, String RAM,String Storage, String bluetooth, String integratedGraphicsCard) {
        this.CPU=CPU;
        this.RAM=RAM;
        this.Storage=Storage;
        this.bluetooth=bluetooth;
        this.integratedGraphicsCard = integratedGraphicsCard;

    }
    public  String  toString(){
        return"CPU--> "+ CPU +" RAM--> "+RAM+" Storage--> "+Storage+" Bluetooth--> "+bluetooth+
                " Integrated Graphics Card--> "+integratedGraphicsCard;
    }
    public static class ComputerBuilder {
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

    public static void main(String[] args) {
        Computer bussinesComputer = new Computer.ComputerBuilder("intel", "8 GB", "254 SSD")
                .enableBluetooth("enabled")
                .build();

        System.out.println(bussinesComputer);

        Computer gamingComputer = new Computer.ComputerBuilder("NVIDIA", "16 GB", "512 SSD")
                .setIntegratedGraphicsCard("NVIDIA RTX 3060")
                .build();

        System.out.println(gamingComputer);
    }

}

