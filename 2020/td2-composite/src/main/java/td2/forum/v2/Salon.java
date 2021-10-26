package td2.forum.v2;

public class Salon extends Conteneur<Message> implements IContenu<Salon>, IConteneur<Message> {

    public Salon(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "Salon";
    }

}
