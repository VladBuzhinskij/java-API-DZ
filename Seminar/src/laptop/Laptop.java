package laptop;

import java.util.Objects;

public class Laptop {
    public String brand;
    public String model;
    public double processor_frequency;
    public byte count_cores;
    public int volume_RAM;
    public String model_videocard;
    public int volume_HDD;
    public int ID;

    public Laptop(String brand, String model, double processor_frequency, byte count_cores, int volume_RAM,
            String model_videocard, int volume_HDD, int ID) {
        this.brand = brand;
        this.model = model;
        this.processor_frequency = processor_frequency;
        this.count_cores = count_cores;
        this.volume_RAM = volume_RAM;
        this.model_videocard = model_videocard;
        this.volume_HDD = volume_HDD;
        this.ID = ID;
    }

    public boolean repair ()
    {
        return true;
    }

    @Override
    public String toString() {
        return "laptop [brand=" + brand + ", model=" + model + ", processor_frequency=" + processor_frequency
                + ", count_cores=" + count_cores + ", volume_RAM=" + volume_RAM + ", model_videocard=" + model_videocard
                + ", volume_HDD=" + volume_HDD + ", ID=" + ID + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, processor_frequency, count_cores, volume_RAM, model_videocard,volume_HDD, ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return  processor_frequency== laptop.processor_frequency && count_cores == laptop.count_cores && volume_RAM == 
        laptop.volume_RAM && volume_HDD == laptop.volume_HDD;
    }
}
