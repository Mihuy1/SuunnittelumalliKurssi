package Builder;

public class Main {
    
    public static void main(String[] args) {

        // Gaming Computer
        ComputerBuilder computerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        computerDirector.constructComputer();
        Computer computer = computerBuilder.getComputer();
        System.out.println("Gaming Computer built with the following components:");
        System.out.println("CPU: " + computer.getCPU().getName());
        System.out.println("GPU: " + computer.getGPU().getName());
        System.out.println("RAM: " + computer.getRAM().getName());
        System.out.println("Storage: " + computer.getStorage().getName());
        System.out.println("OS: " + computer.getOS().getName());

        // Office Computer
        computerBuilder = new OfficeComputerBuilder();
        computerDirector = new ComputerDirector(computerBuilder);
        computerDirector.constructComputer();
        computer = computerBuilder.getComputer();
        System.out.println("Office Computer built with the following components:");
        System.out.println("CPU: " + computer.getCPU().getName());
        System.out.println("GPU: " + computer.getGPU().getName());
        System.out.println("RAM: " + computer.getRAM().getName());
        System.out.println("Storage: " + computer.getStorage().getName());
        System.out.println("OS: " + computer.getOS().getName());
    }

}
