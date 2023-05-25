/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.appplicationfrais;

/**
 *
 * @author mleprovost
 */
public class Visiteur {

    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String adresse;
    private int cp;
    private String ville;
    private String dateembauche;
    private int statut;

    public Visiteur(String id, String nom, String prenom, String login, String adresse, int cp, String ville, String dateembauche, int statut) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.dateembauche = dateembauche;
        this.statut = statut;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public String getDateembauche() {
        return dateembauche;
    }

    public int getStatut() {
        return statut;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setDateembauche(String dateembauche) {
        this.dateembauche = dateembauche;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Object[] toArray() {
        Object[] u1 = new Object[]{this.id, this.nom, this.prenom, this.login, this.adresse, this.cp, this.ville, this.dateembauche,this.statut};
        return u1;
    }
}
