package main.java.td2.forum.v2;

public class Message {
    private final String topic;
    private final String contenu;

    public Message(String topic, String contenu)
    {
        this.topic = topic;
        this.contenu = contenu;
    }

    public String sujet()
    {
        return this.topic;
    }

    public String toString()
    {
        String str = topic + ' ' + contenu;
        return str;
    }
}
