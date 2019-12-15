public class testSingleton {
    public static void main(String[] args) {
        FactoryEnseignant fe = new CreateDirecteur();
        FactoryEnseignant fe2 = new CreateProfesseur();

        Enseignant dir = fe.createEnseignant("dir1");
        Enseignant prof = fe2.createEnseignant("prof");

        System.out.println(dir);
        System.out.println(prof);

        dir.ajouterNote(20);
        prof.ajouterNote(10);

        System.out.println(MoyenneEtudiantsSingleton.getINSTANCE());
    }
}
