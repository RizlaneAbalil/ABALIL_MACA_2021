package td2.forum.v2;

public class Message implements IContenu<Message> {

    private final String sujet;
    private final String contenu;

    public Message(String sujet, String contenu) {
        this.sujet = sujet;
        this.contenu = contenu;
    }

    @Override
    public String sujet() {
        return sujet;
    }

    @Override
    public String contenu() {
        return contenu;
    }

    @Override
    public String typeRepr() {
        return "Message";
    }

    @Override
    public String toString() {
        return repr();
    }
}
