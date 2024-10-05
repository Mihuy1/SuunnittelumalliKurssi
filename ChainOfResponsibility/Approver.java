package ChainOfResponsibility;

public class Approver {

    Approver nextApprover;

    public void process(Message message) {
        if (nextApprover != null) {
            nextApprover.process(message);
        }
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public Approver getNextApprover() {
        return nextApprover;
    }
    
}
