package fr.demos.models;

import java.util.Date;

public class Livre {
	private int isbn;
	private String titre;
	private String auteur;
	private String categorie;
	private Boolean estReserve;
	private Date adresseDeRetour = new Date();
	private Date adresseDEmprunt = new Date();
	private int idEmprunteur;

	public Livre(String titre, String auteur, String categorie) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public Date getAdressederetour() {
		return adresseDeRetour;
	}

	public void setAdressederetour(Date adressederetour) {
		this.adresseDeRetour = adressederetour;
	}

	public Date getAdressedemprunt() {
		return adresseDEmprunt;
	}

	public void setAdressedemprunt(Date adressedemprunt) {
		this.adresseDEmprunt = adressedemprunt;
	}

	public int getIdEmprunteur() {
		return idEmprunteur;
	}

	public void setIdEmprunteur(int idEmprunteur) {
		this.idEmprunteur = idEmprunteur;
	}

}
