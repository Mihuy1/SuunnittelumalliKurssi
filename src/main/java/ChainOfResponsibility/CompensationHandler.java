package ChainOfResponsibility;

import ChainOfResponsibility.Message.MessageType;

public class CompensationHandler extends Approver {

    @Override
    public void process(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION) {
            System.out.println("Handling compensation claim from: " + message.getSenderEmail());
        } else {
            super.process(message);
        }
    }
    
}
