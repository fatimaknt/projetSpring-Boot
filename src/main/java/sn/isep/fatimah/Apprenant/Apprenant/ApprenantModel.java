package sn.isep.fatimah.Apprenant.Apprenant;

public class ApprenantModel {
    
    private Long id;
    private String prenom;
    private String nom;
    private String adresse;
    private int age;


    // Constructeur par défaut
    public ApprenantModel() {
    }

    public ApprenantModel(Long id,String prenom, String nom, String adresse, int age) {
        super();
        this.id=id;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    // Setter pour id
    public void setId(Long id) {
        this.id = id;
    }

}





