package Module1.BuilderPatternExample;

public class Computer {
   private final String CPU;
   private final String RAM;
   private final String Storage;
   private final String bluetooth;
   private final String integratedGraphicsCard;

   public  Computer(String CPU, String RAM, String Storage, String bluetooth, String integratedGraphicsCard) {
      this.CPU = CPU;
      this.RAM = RAM;
      this.Storage = Storage;
      this.bluetooth = bluetooth;
      this.integratedGraphicsCard = integratedGraphicsCard;
   }
   public String toString() {
      return "CPU--> " + this.CPU + " RAM--> " + this.RAM + " Storage--> " + this.Storage + " Bluetooth--> " + this.bluetooth + " Integrated Graphics Card--> " + this.integratedGraphicsCard;
   }

   public static void main(String[] args) {
      Computer bussinesComputer = (new ComputerBuilder("intel", "8 GB", "254 SSD")).enableBluetooth("enabled").build();
      System.out.println(bussinesComputer);
      Computer gamingComputer = (new ComputerBuilder("NVIDIA", "16 GB", "512 SSD")).setIntegratedGraphicsCard("NVIDIA RTX 3060").build();
      System.out.println(gamingComputer);
   }
}
