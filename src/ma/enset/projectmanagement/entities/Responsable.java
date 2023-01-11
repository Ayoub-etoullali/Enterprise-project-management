package ma.enset.projectmanagement.entities;

import ma.enset.projectmanagement.utils.StringUtils;
import ma.enset.projectmanagement.utils.files.FileMappable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Responsable implements FileMappable<Responsable> {
    public static final String RESPONSABLE = "RESPONSABLE";

    private String matricule;
    private String nom;
    private String prenom;
    private String numeroTel;
    private String email;
    private String motDePasse;


    private List<Projet> projectList = new ArrayList<>();

    public Responsable() {
    }

    public Responsable(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Responsable(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Responsable(String matricule, String nom, String prenom, String numeroTel, String email, String motDePasse) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Responsable(String matricule, String nom, String prenom, String numeroTel, String email, String motDePasse, List<Projet> projectList) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.email = email;
        this.motDePasse = motDePasse;
        this.projectList = projectList;
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

    public List<Projet> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Projet> projectList) {
        this.projectList = projectList;
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

    @Override
    public String toString() {
        return "Responsable{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
    @Override
    public String mapperToLine() {
        return String.join(
                StringUtils.SEMI_COLON,
                Arrays.asList(
                        RESPONSABLE,
                        matricule,
                        nom,
                        prenom,
                        numeroTel,
                        email
                )
        );
    }

    public static Responsable mapperInfosFromLine(String line) {
        Responsable responsable = new Responsable();
        String[] infos = line.split(StringUtils.SEMI_COLON.toString());
        responsable.setMatricule(infos[1]);
        responsable.setNom(infos[2]);
        responsable.setPrenom(infos[3]);
        responsable.setNumeroTel(infos[4]);
        responsable.setEmail(infos[5]);
        return responsable;
    }
}
