package smu.Homework;

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n Memory: %s\n HDD: %s\n Color: %s\n Power: %s\n", cpu, memory, hd, color, power);
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n Color: %s\n Power: %s\n", monitorSize, color, power);
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Computer comp = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor mon = new Monitor("24 inch", "Black", "45W");

        PersonalComputer pc = new PersonalComputer(comp, mon);

        pc.turnOn();
        pc.printInfo();
    }
}
