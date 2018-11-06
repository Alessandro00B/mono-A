
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(800,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		String st = "";
		StringBuilder htmStringB = new StringBuilder();
		
		// TODO Creare la stringa HTML per il wireframe
		htmStringB.append("<html>");
		
		htmStringB.append("<head>");
		htmStringB.append("<h1>Almanacco astronomico</h1>");
		htmStringB.append("<h5>Novembre 2018</h5>");
		htmStringB.append("</head>");
		
		htmStringB.append("<body>");
		htmStringB.append("<p><b>Il Sole. </b><i>In Novembre perderemo complessivamente 1 ora e 3 minuti di luce.</i></p>");
		htmStringB.append("<br>");
		htmStringB.append("<div>");
		htmStringB.append("<div style=\"display:table;width:100%\">");
		
		//riga 1 
		htmStringB.append("<div style=\"display:table-row\">");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("Data");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("Sorge");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("Tramonta");
		htmStringB.append("</div>");
		htmStringB.append("</div>"); 
		//fine riga 1
		htmStringB.append("<hr>"); 
		//riga 2
		htmStringB.append("<div style=\"display:table-row\">");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("1 gio");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("6:55");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("17:10");
		htmStringB.append("</div>");
		htmStringB.append("</div>"); 
		//fine riga 2
		
		//riga 3
		htmStringB.append("<div style=\"display:table-row\">");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("2 ven");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("6:56");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("17:08");
		htmStringB.append("</div>");
		htmStringB.append("</div>"); 
		//fine riga 3
		
		//riga 4
		htmStringB.append("<div style=\"display:table-row\">");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("3 sab");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("6:55");
		htmStringB.append("</div>");
		htmStringB.append("<div style=\"display:table-cell\">");
		htmStringB.append("17:07");
		htmStringB.append("</div>");
		htmStringB.append("</div>"); 
		//fine riga 4
		
		htmStringB.append("</div>");
		htmStringB.append("</div>");

		
		htmStringB.append("</body>");
		htmStringB.append("</html>");
		
		// TODO Convertire lo StringBuilder in String
		st = htmStringB.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(st));
		super.setVisible(true);
		 
		System.out.println(htmStringB);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

