package woche_05.aufgabe_09;

public class Main {
    public static void main(String[] args) {
        WeldingRobot w_robot = new WeldingRobot("12345", 30.0);
        TransportRobot t_robot = new TransportRobot("54321", 200);

        System.out.printf("Battery percentage: %d \n", t_robot.batteryPercentage);
        System.out.println("Executing task...");
        t_robot.execute();
        System.out.printf("Battery percentage: %d \n", t_robot.batteryPercentage);

        System.out.println("Recharging Battery...");
        t_robot.recharge();
        System.out.printf("Battery percentage: %d \n", t_robot.batteryPercentage);

    }
}
