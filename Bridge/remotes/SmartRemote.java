package Bridge.remotes;

import Bridge.devices.Device;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("voiceControl");
    }
}
