package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        CompensationHandler compensationHandler = new CompensationHandler();
        ContactRequestHandler contactRequestHandler = new ContactRequestHandler();
        FeedbackHandler feedbackHandler = new FeedbackHandler();
        DevelopmentSuggestionHandler developmentSuggestionHandler = new DevelopmentSuggestionHandler();

        compensationHandler.setNextApprover(contactRequestHandler);
        contactRequestHandler.setNextApprover(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextApprover(feedbackHandler);

        Message[] messages = {
            new Message("Need compensation for delayed delivery.", "customer1@example.com", Message.MessageType.COMPENSATION),
            new Message("I want to be contacted regarding my order.", "customer2@example.com", Message.MessageType.CONTACT),
            new Message("Feature request for a dark mode.", "customer3@example.com", Message.MessageType.DEVELOPMENT),
            new Message("Great service!", "customer4@example.com", Message.MessageType.FEEDBACK)
        };

        for(Message message : messages) {
            compensationHandler.process(message);
        }
        
    }
}
