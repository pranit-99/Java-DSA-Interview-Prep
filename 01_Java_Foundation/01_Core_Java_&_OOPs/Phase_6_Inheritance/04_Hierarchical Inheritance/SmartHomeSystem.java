class SmartDevice{
    protected String deviceName;
    protected boolean connected;

    void displayDeviceStatus(){
        System.out.println("Device: " + deviceName);
        System.out.println("Connected: " + connected);
    }
}

class SmartLight extends SmartDevice{
    int brightness;

    void displayLightDetails(){
        System.out.println("Brightness:-" + brightness + "%");
    }
}

class SmartFan extends SmartDevice{
    int speedLevel;

    void displayFanDetails(){
        System.out.println("Fan Speed Level:" + speedLevel);
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.deviceName = "Living Room Light";
        light.connected = true;
        light.brightness  = 80;

        light.displayDeviceStatus();
        light.displayLightDetails();
        System.out.println("----------------");
        SmartFan fan = new SmartFan();
        fan.deviceName  = "Bedroom Fan";
        fan.connected = true;
        fan.speedLevel  = 4;

        fan.displayDeviceStatus();
        fan.displayFanDetails();
    }
}
