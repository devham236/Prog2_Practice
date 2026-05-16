package woche_05.aufgabe_10;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermo = new Thermostat();

        System.out.printf("Device State: %b\n", thermo.getState());
        System.out.printf("Power consumption: %.2f \n", thermo.powerConsumption());
        System.out.println("Turning device on...");
        thermo.toggleTargetState(true);
        System.out.printf("Device state: %b \n", thermo.getState());
        System.out.printf("Power consumption: %.2f \n", thermo.powerConsumption());
    }
}
