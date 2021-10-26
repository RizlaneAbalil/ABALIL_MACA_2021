package td2.forum.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Theme {

    private final String topic;
    private final List<Salon> children;

    public Theme(String topic) {
        this.topic = topic;
        this.children = new ArrayList<>();
    }

    public String sujet() {
        return topic;
    }

    public void add(Salon child) {
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
        return String.format("Theme: %s\n%s",
                topic,
                this.children.stream()
                        .map(Salon::toString)
                        .collect(Collectors.joining("\n")));
    }

}
