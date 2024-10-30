package Builder;

public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;


    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU(new Component("AMD Ryzen 7 7800X3D"));
    }

    @Override
    public void buildGPU() {
        computer.setGPU(new Component("GeForce RTX 4090"));
    }

    @Override
    public void buildRAM() {
        computer.setRAM(new Component("32GB DDR5"));
    }

    @Override
    public void buildStorage() {
        computer.setStorage(new Component("SSD 1TB"));
    }

    @Override
    public void buildOS() {
        computer.setOS(new Component("Windows 11"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
