package ChainOfResponsibility;

import ChainOfResponsibility.Message.MessageType;

public class ContactRequestHandler extends Approver {
    
    @Override
    public void process(Message message) {
        if (message.getMessageType() == MessageType.CONTACT) {
            System.out.println("Forwarding contact request from: " + message.getSenderEmail());
        } else {
            super.process(message);
        }
    }
}
