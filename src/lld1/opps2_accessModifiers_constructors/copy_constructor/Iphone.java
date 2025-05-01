package lld1.opps2_accessModifiers_constructors.copy_constructor;

public class Iphone {
    public int number;
    public int processorVersion;
    public int price;

    //All below attributes remain the same

    public int batterySize;
    public int screenSize;
    public int numberOfCameras;
    public int megapixels;
    public int memory;
    public String displayType;
    public String dimensions;

    public Iphone(){//no-args constructor/default constructor.

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "number=" + number +
                ", processorVersion=" + processorVersion +
                ", price=" + price +
                ", batterySize=" + batterySize +
                ", screenSize=" + screenSize +
                ", numberOfCameras=" + numberOfCameras +
                ", megapixels=" + megapixels +
                ", memory=" + memory +
                ", displayType='" + displayType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }

    //Parameterised constructor
    public Iphone(int number, int processorVersion, int price, int batterySize, int screenSize, int numberOfCameras, int megapixels, int memory, String displayType, String dimensions) {
        this.number = number;
        this.processorVersion = processorVersion;
        this.price = price;
        this.batterySize = batterySize;
        this.screenSize = screenSize;
        this.numberOfCameras = numberOfCameras;
        this.megapixels = megapixels;
        this.memory = memory;
        this.displayType = displayType;
        this.dimensions = dimensions;
    }

    //Copy constructor
    public Iphone(Iphone iphone){
        this.number = iphone.number+1;
        this.processorVersion = iphone.processorVersion+1;
        this.price = iphone.price+10000;
        this.batterySize = iphone.batterySize;
        this.screenSize = iphone.screenSize;
        this.numberOfCameras = iphone.numberOfCameras;
        this.megapixels = iphone.megapixels;
        this.memory = iphone.memory;
        this.displayType = displayType;
        this.dimensions = dimensions;
    }
}

//shortcut to make constructors(commanda+n).