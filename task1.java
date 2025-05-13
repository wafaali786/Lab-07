class Message {
    String text; 

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return text;
    }
}

class SMS extends Message {
    String recipientContactNo; 

    public SMS(String recipientContactNo, String text) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public String toString() {
        return "To: " + recipientContactNo + "\nMessage: " + text;
    }
}

class Email extends Message {
    String sender;   
    String receiver; 
    String subject;  

    public Email(String sender, String receiver, String subject, String text) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nSubject: " + subject + "\nMessage: " + text;
    }
}

public class task1 {
    public static void main(String[] args) {
        SMS sms = new SMS("03116014199", "Hey, are you coming to the party tonight?");
        Email email = new Email("shahzai@example.com", "ilyas@example.com", "Weekend Plans", "Let's go hiking this weekend.");

        System.out.println(sms.toString());
        System.out.println();
        System.out.println(email.toString());
    }
}
