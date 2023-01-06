package ma.enset.projectmanagement.entities;

import java.util.ArrayList;
import java.util.List;

public class Intervenant {
    private String matricule;
    private String nom;
    private String prenom;
    private String numeroTel;
    private String email;
    private String motDePasse;

    private List<Projet> projectList = new ArrayList<>();
    public Intervenant() {
    }

    public Intervenant(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Intervenant(String matricule, String nom, String prenom, String numeroTel, String email, String motDePasse) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Projet> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Projet> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "Intervenant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", projectListt=" + projectList +
                '}';
    }
}
