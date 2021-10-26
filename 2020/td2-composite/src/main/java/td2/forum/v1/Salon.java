package td2.forum.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Salon {

    private final String topic;
    private final List<Message> children;

    public Salon(String topic) {
        this.topic = topic;
        this.children = new ArrayList<>();
    }

    public String sujet() {
        return topic;
    }

    public void add(Message child) {
        children.add(child);
    }

    public void remove(int index) {
        children.remove(index);
    }

    public int size() {
        return children.size();
    }

    @Override
    public String toString() {
        return String.format("Salon: %s\n%s",
                topic,
                this.children.stream()
                        .map(Message::toString)
                        .collect(Collectors.joining("\n")));
    }

}
