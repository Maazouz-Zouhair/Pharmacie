package models.pharmacie;

import java.util.ArrayList;

import models.employe.Employe;
import models.employe.Pharmacien;

public class Pharmacie {
	private String nom;
	private int nombreEmployees;
	private int surfaceCommerciel;
	private String siret;
	private Pharmacien pharmacien;
	private ArrayList<Employe> employes = new ArrayList();
	public Pharmacie(String nom, int nombreEmployees, int surfaceCommerciel, String siret, Pharmacien pharmacien) {
		super();
		this.nom = nom;
		this.nombreEmployees = nombreEmployees;
		this.surfaceCommerciel = surfaceCommerciel;
		this.siret = siret;
		this.pharmacien = pharmacien;
		addEmploye(pharmacien);
	}
	
	public boolean addEmploye(Employe employe) {
		if(employe==null) return false;
		return employes.add(employe);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreEmployees() {
		return nombreEmployees;
	}

	public void setNombreEmployees(int nombreEmployees) {
		this.nombreEmployees = nombreEmployees;
	}

	public int getSurfaceCommerciel() {
		return surfaceCommerciel;
	}

	public void setSurfaceCommerciel(int surfaceCommerciel) {
		this.surfaceCommerciel = surfaceCommerciel;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public Pharmacien getPharmacien() {
		return pharmacien;
	}

	public void setPharmacien(Pharmacien pharmacien) {
		this.pharmacien = pharmacien;
	}

	public ArrayList<Employe> getEmployes() {
		return employes;
	}
	
}
