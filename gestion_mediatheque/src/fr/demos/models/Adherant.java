package fr.demos.models;

import java.util.ArrayList;

public class Adherant {
	private int id;
	private String nom;
	private String adresseMail;
	private int numeroAdherant;
	ArrayList<Livre> lisvreEmprumte = new ArrayList();

	public Adherant(String nom, String adresseMail, int numeroAdherant, ArrayList<Livre> lisvreEmprumte) {
		super();
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.numeroAdherant = numeroAdherant;
		this.lisvreEmprumte = lisvreEmprumte;
	}

	public Adherant(String nom, String adresseMail, int numeroAdherant) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
