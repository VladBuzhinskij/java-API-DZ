import java.util.HashSet;
import java.util.LinkedList;

import laptop.Laptop;


public class App {
    // Laptop(String brand, String model, double processor_frequency, byte count_cores, int volume_RAM,
    //         String model_videocard, int volume_HDD, int ID)
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop ("MSI", "mi123",3.7,(byte)6,16000, "RTX3060",5000000,1);
        Laptop laptop2 = new Laptop ("Dell", "DL123",4.5,(byte)4,8000, "RTX3060",256000,2);
        HashSet<Laptop> laptopSet = new HashSet<Laptop>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptopSet.contains(laptop2));
    }
}
