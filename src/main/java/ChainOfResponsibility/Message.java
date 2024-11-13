package ChainOfResponsibility;

public class Message {
    
    private String messageContent;
    private String senderEmail;
    private MessageType messageType;

    public enum MessageType {
        COMPENSATION, CONTACT, DEVELOPMENT, FEEDBACK
    }

    public Message(String messageContent, String senderEmail, MessageType messageType) { 
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public MessageType getMessageType() {
        return messageType;
    }
}