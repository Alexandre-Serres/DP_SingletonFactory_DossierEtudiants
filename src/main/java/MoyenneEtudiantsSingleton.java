import java.util.ArrayList;
import java.util.List;

public final class MoyenneEtudiantsSingleton {

    private static MoyenneEtudiantsSingleton INSTANCE = new MoyenneEtudiantsSingleton();
    private List<Integer> notes = new ArrayList<>(); //la matière n'est pas importante dans l'exemple

    private MoyenneEtudiantsSingleton(){
    }

    public static synchronized MoyenneEtudiantsSingleton getINSTANCE() {
        return  INSTANCE;
    }

    public void addNotes(int note){ //on ne va pas en remove
        this.notes.add(note);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int cpt=1;
        for (Integer i : notes){
            sb.append("moyenne").append(cpt).append(" : ").append(i);
            cpt++;
        }
        return sb.toString();
    }

}
