package fr.demos.models;

public class Livre {
	private String titre;
	private String auteur;
	private String categorie;
	private Boolean estReserve;
	public Livre(String titre, String auteur, String categorie, Boolean estReserve) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.estReserve = estReserve;
	}
	public Livre(String titre, String auteur, String categorie) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Boolean getEstReserve() {
		return estReserve;
	}
	public void setEstReserve(Boolean estReserve) {
		this.estReserve = estReserve;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", categorie=" + categorie + ", estReserve="
				+ estReserve + "]";
	}
	
	
	
}
