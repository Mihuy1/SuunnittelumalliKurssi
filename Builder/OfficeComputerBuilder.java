package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    
    private Computer computer;

    
    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU(new Component("Intel Core i5-12600K"));
    }

    @Override
    public void buildGPU() {
        computer.setGPU(new Component("Intel UHD Graphics 770"));
    }

    @Override
    public void buildRAM() {
        computer.setRAM(new Component("16GB DDR4"));
    }

    @Override
    public void buildStorage() {
        computer.setStorage(new Component("SSD 512GB"));
    }

    @Override
    public void buildOS() {
        computer.setOS(new Component("Windows 10"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
