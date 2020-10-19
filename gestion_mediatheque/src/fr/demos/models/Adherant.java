package fr.demos.models;

import java.util.ArrayList;

public class Adherant {
	private int id;
	private String nom;
	private String adresseMail;
	private String numeroAdherant;
	ArrayList<Livre> livresEmprumtees = new ArrayList();

	public Adherant(String nom, String adresseMail, String numeroAdherant, ArrayList<Livre> lisvreEmprumte) {
		super();
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.numeroAdherant = numeroAdherant;
		this.livresEmprumtees = lisvreEmprumte;
	}

	public Adherant(String nom, String adresseMail, String numeroAdherant) {
		super();
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.numeroAdherant = numeroAdherant;
	}

	public Adherant() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getNumeroAdherant() {
		return numeroAdherant;
	}

	public void setNumeroAdherant(String numeroAdherant) {
		this.numeroAdherant = numeroAdherant;
	}

	public ArrayList<Livre> getLisvreEmprumte() {
		return livresEmprumtees;
	}

	public void setLisvreEmprumte(ArrayList<Livre> lisvreEmprumte) {
		this.livresEmprumtees = lisvreEmprumte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void reserveUnlivre(Livre livre) {
		if (livresEmprumtees.size() < 5 && livre.getEstReserve() == false) {
			livresEmprumtees.add(livre);
			livre.setEstReserve(true);
			livre.setIdEmprunteur(this.id);
		} else if (livre.getEstReserve() == true) {
			System.out.println(getNom() + " ce livre est déjà empruntée");
		} else {
			System.out.println(getNom() + " a déjà emprunté 5 livres");

		}
	}

	public void restituerUnlivre(Livre livre) {
		if (livre.getEstReserve() == true && livre.getIdEmprunteur() == this.id) {
			livre.setEstReserve(false);
			livresEmprumtees.remove(livre);
			livre.setIdEmprunteur(0);
		} else {
			System.out.println("restitution impossible du livre.");
		}
	}

	@Override
	public String toString() {
		return "Adherant [id=" + id + ", nom=" + nom + ", adresseMail=" + adresseMail + ", numeroAdherant="
				+ numeroAdherant + ", livresEmprumtees=" + livresEmprumtees + "]";
	}

}// fin de la classe
