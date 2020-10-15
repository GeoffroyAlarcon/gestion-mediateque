package fr.demos.mediatheque;

import java.util.ArrayList;

import fr.demos.models.Adherant;
import fr.demos.models.Livre;

public class Mediatheque {
	String nom;
	ArrayList<Livre> listeDeLivres = new ArrayList();
	ArrayList<Adherant> listeDAdherants = new ArrayList();

	public Mediatheque(String nom) {
		super();
		this.nom = nom;
	}

	public Mediatheque(String nom, ArrayList<Livre> listeDeLivres, ArrayList<Adherant> listeDAdherants) {
		super();
		this.nom = nom;
		this.listeDeLivres = listeDeLivres;
		this.listeDAdherants = listeDAdherants;
	}

	public Mediatheque() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Livre> getListeDeLivres() {
		return listeDeLivres;
	}

	public void setListeDeLivres(ArrayList<Livre> listeDeLivres) {
		this.listeDeLivres = listeDeLivres;
	}

	public ArrayList<Adherant> getListeDAdherants() {
		return listeDAdherants;
	}

	public void setListeDAdherants(ArrayList<Adherant> listeDAdherants) {
		this.listeDAdherants = listeDAdherants;
	}

	public void ajouterUnlivre(Livre livre) {
		listeDeLivres.add(livre);
	}

	public void ajouterUnAdherant(Adherant adherant) {
		listeDAdherants.add(adherant);
	}

	public void supprimerUnlivre(Livre livre) {
		listeDeLivres.remove(livre);
	}

	public void supprimerUnAdherant(Adherant adherant) {
		listeDAdherants.remove(adherant);
	}

	public void updateAderants(int id, Adherant adherant) {
		for (Adherant findAdherant : listeDAdherants) {
			if (id == findAdherant.getId()) {
				listeDAdherants.remove(findAdherant);
				listeDAdherants.add(findAdherant);
			}
		}
	}

	public void updateAderants(int id, Livre livre) {
		for (Livre findLivre : listeDeLivres) {
			if (id == findLivre.getId()) {
				listeDeLivres.remove(findLivre);
				listeDeLivres.add(findLivre);
			}
		}
	}

	@Override
	public String toString() {
		return "Mediatheque [nom=" + nom + ", listeDeLivres=" + listeDeLivres + ", listeDAdherants=" + listeDAdherants
				+ "]";
	}

}
