
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,500);
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<h1>Color Picker</h1>");
		// Creazione tabella 
		sb.append("<table>");
		// Apertura prima riga
		sb.append("<tr>");
		// Ho utilizzato il tag h3 per il carattere più grande nella tabella, perché java non legge il tag b
		sb.append("<td><h2>Name</h2></td>");
	
		sb.append("<td><h2>Hex</h2></td>");
		
		sb.append("<td><h2>RGB</h2></td>");
		// Chiusura della prima riga
		sb.append("</tr>");
		
		// Apertura seconda riga
		sb.append("<tr>");
		sb.append("<td>Persian Green</td>");
		sb.append("<td>#00A693</td>");
		sb.append("<td>0,166,147</td>");
		// Chiusura seconda riga
		sb.append("</tr>");
		
		// Apertura terza riga
		sb.append("<tr>");
		sb.append("<td>Venice Blue</td>");
		sb.append("<td>#055989</td>");
		sb.append("<td>5,89,137</td>");
		sb.append("</td>");
		// Chiusura terza riga
		sb.append("</tr>");
		
		// Apertura quarta riga
		sb.append("<tr>");
		sb.append("<td>Pale Blue</td>");
		sb.append("<td>#73D1E4</td>");
		sb.append("<td>115,209,228</td>");
		sb.append("</td>");
		// Chiusura quarta riga
		sb.append("</tr>");
		
		//Chiusura tabella
		sb.append("</table>");
		//Chiusura html
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String html = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

