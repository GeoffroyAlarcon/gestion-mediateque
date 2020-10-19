package fr.demos.main;

import java.sql.Date;

import fr.demos.mediatheque.Mediatheque;
import fr.demos.models.Adherant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediatheque mediatheque = new Mediatheque("m�diath�que du Mans");
		Adherant geoffroy = new Adherant("Geoffroy Alarcon", "geoffroy.alarcon@gmail.com", "06-33-02-67");
		Adherant geoffroy1 = new Adherant("Geoffroy Alarcon", "geoffroy.alarcon@gmail.com", "06-33-02-67");
		Adherant geoffroy2 = new Adherant("Geoffroy Alarcon", "geoffroy.alarcon@gmail.com", "06-33-02-67");
		mediatheque.ajouterUnAdherant(geoffroy);
		mediatheque.ajouterUnAdherant(geoffroy1);
		mediatheque.ajouterUnAdherant(geoffroy2);
		mediatheque.ajouterUnAdherant(geoffroy);
		
		System.out.println(mediatheque.findAllAdherants());
	Date testDate = new Date(00,01,12);
	System.out.println(testDate);
	
	}

}
