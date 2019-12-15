public class Professeur implements Enseignant {

    private String nom;

    public Professeur() {
    }

    @Override
    public void ajouterNote(int note) {
        MoyenneEtudiantsSingleton.getINSTANCE().addNotes(note);
    }

    @Override
    public void setName(String name){
        this.nom=name;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString(){
        return "Nom professeur : " + getNom();
    }
}
