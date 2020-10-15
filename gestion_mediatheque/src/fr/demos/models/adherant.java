package fr.demos.models;

import java.util.ArrayList;


public class adherant {
	private String nom;
	private String adresseMail;
	private int numeroAdherant;
	ArrayList<Livre> lisvreEmprumte = new ArrayList();
	public adherant(String nom, String adresseMail, int numeroAdherant, ArrayList<Livre> lisvreEmprumte) {
		super();
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.numeroAdherant = numeroAdherant;
		this.lisvreEmprumte = lisvreEmprumte;
	}
	public adherant(String nom, String adresseMail, int numeroAdherant) {
		super();
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.numeroAdherant = numeroAdherant;
	}
	public adherant() {
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
	public int getNumeroAdherant() {
		return numeroAdherant;
	}
	public void setNumeroAdherant(int numeroAdherant) {
		this.numeroAdherant = numeroAdherant;
	}
	public ArrayList<Livre> getLisvreEmprumte() {
		return lisvreEmprumte;
	}
	public void setLisvreEmprumte(ArrayList<Livre> lisvreEmprumte) {
		this.lisvreEmprumte = lisvreEmprumte;
	}

}
