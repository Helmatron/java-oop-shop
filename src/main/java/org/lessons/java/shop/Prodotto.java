package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {

	private static int CODE;
	private String name;
	private String description;
	private double price;
	private static int IVA;

	public Prodotto(int code, String name, String description, double price) {
		this.CODE = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.IVA = 22;
	}

	// Metodo che concatena tutti i setter
	public void nuovoProdotto() {
		setCode();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il nome del nuovo prodotto");
		setName(input.nextLine());
		System.out.println("Inserire la descrizione del nuovo prodotto");
		setDescription(input.nextLine());
		System.out.println("Inserire il prezzo del prodotto");
		setPrice(input.nextDouble());
		input.close();

	}

	// metodo che concatena tutti i getter
	public void getNuovoProdotto() {
		System.out.println("Complimenti! L'operazione è stata completata con successo!");
		// System.out.println("Il codice del prodotto " + getName().toUpperCase() + " è:
		// " + getCode());
		// getCodeName();
		System.out.println("Prodotto: " + getPadLeftCode(null) + "-" + getName().toUpperCase());
		System.out.println("Descrizione del prodotto: " + getDescription());
		System.out.println("Prezzo del prodotto Iva esclusa: " + getPrice() + " €");
		System.out.println(
				"Prezzo del prodotto con Iva inclusa del " + getIVA() + "%: " + getIvaPrice(getPrice()) + " €");

	}

	// Genero un codice Random: voglio un codice a 8 cifre casuali
	private void setCode() {
		CODE = (int) (Math.random() * (99999999 - 1) + 1);
	}

	public int getCode() {
		return CODE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Restituzione prezzo iva inclusa
	public double getIvaPrice(double ivaPrice) {
		return ivaPrice = ((price * 22) / 100) + price;
	}

	// Restituzione concatenazione codice e nome prodotto
	public void getCodeName() {
		System.out.println("Prodotto: " + getCode() + "-" + getName().toUpperCase());
	}

	// Restituzione del codice con 8 caratteri
	private static String getPadLeftCode(String PadLcode) {
		return PadLcode = String.format("%1$8s", CODE).replace(" ", "0");

	}

	public int getIVA() {
		return IVA;
	}

}
