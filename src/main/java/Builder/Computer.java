package Builder;

public class Computer {

    private Component CPU;
    private Component GPU;
    private Component RAM;
    private Component storage;
    private Component OS;

    public Component getCPU() {
        return CPU;
    }

    public void setCPU(Component CPU) {
        this.CPU = CPU;
    }

    public Component getGPU() {
        return GPU;
    }

    public void setGPU(Component GPU) {
        this.GPU = GPU;
    }

    public Component getRAM() {
        return RAM;
    }

    public void setRAM(Component RAM) {
        this.RAM = RAM;
    }

    public Component getStorage() {
        return storage;
    }

    public void setStorage(Component storage) {
        this.storage = storage;

    }

    public Component getOS() {
        return OS;
    }

    public void setOS(Component OS) {
        this.OS = OS;
    }

    
}
