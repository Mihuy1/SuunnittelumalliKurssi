package ChainOfResponsibility;

import ChainOfResponsibility.Message.MessageType;

public class FeedbackHandler extends Approver {

    @Override
    public void process(Message message) {
        if (message.getMessageType() == MessageType.FEEDBACK) {
            System.out.println("Processing general feedback from: " + message.getSenderEmail());
        } else {
            super.process(message);
        }
    }
    
}
