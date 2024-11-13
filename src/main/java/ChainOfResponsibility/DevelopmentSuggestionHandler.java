package ChainOfResponsibility;

import ChainOfResponsibility.Message.MessageType;

public class DevelopmentSuggestionHandler extends Approver {

    @Override
    public void process(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT) {
            System.out.println("Logging development suggestion from: " + message.getSenderEmail());
        } else {
            super.process(message);
        }
    }
    
}
