public class Directeur implements Enseignant{

    private String nom;

    public Directeur() {
    }

    @Override
    public void ajouterNote(int note) {
        MoyenneEtudiantsSingleton.getINSTANCE().addNotes(note);
    }

    @Override
    public void setName(String name){
        this.nom=name;
    }

    @Override
    public String toString(){
        return "Nom directeur : " + nom;
    }
}
