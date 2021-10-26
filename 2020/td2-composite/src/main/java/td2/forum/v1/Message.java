package td2.forum.v1;

public class Message {

    private final String topic;
    private final String contenu;

    public Message(String topic, String contenu) {
        this.topic = topic;
        this.contenu = contenu;
    }

    public String sujet() {
        return topic;
    }

    @Override
    public String toString() {
        return String.format("Message: %s\n%s", topic, contenu);
    }
}
