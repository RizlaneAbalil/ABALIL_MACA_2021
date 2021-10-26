package td2.forum.v2;

public class Forum extends Conteneur<Theme> implements IConteneur<Theme> {

    public Forum(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "Forum";
    }

}
