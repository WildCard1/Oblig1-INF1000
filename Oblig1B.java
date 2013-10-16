/*
Dette programmet er skrevet av Henrik Hansen for INF1000 grp16.
Denne filen inneholder oppgave B.1 og deretter B.2.
Oppgaven går ut på å regne med lønn til en gitt ansatt,
over et gitt tidsrom(i uker).
Programmet leser fra terminal.
*/

//B.1

import java.util.*; //For å kunne bruke "Scanner".
class Oblig1B {
	public static void main(String[]args){
	Scanner tast = new Scanner(System.in);

System.out.print("Velkommen. Vennligst tast inn ditt fulle navn: ");
	String navn = tast.nextLine(); //Bruker nextLine() så ev. etternavn også kommer med.

System.out.print("Vennligst tast inn din timelønn i hele kroner: ");
	double timelonn = tast.nextDouble(); // Strengt tatt ikke nødvendig å bruke double, men gjør det for sikkerhetsskyld.

System.out.print("Vennligst tast inn antall timer jobbet uke 1: ");
	double antallTimer = tast.nextDouble(); //Double så vi kan jobbe med ev. halve timer.
System.out.println(""); //Linjeskift
	double overtidslonn = 0; //Bruker '0' så den ikke står udefinert; da kan jeg jobbe med den viss vedkommende ikke har jobbet overtid.
	double overtidstimer = 0;
	if (antallTimer > 40) {
			overtidstimer = antallTimer - 40;
			overtidslonn =  overtidstimer * (timelonn * 1.5);
	}
	double normallonn = Math.abs(timelonn*antallTimer); //Bruker Math.abs for å få absolutt verdi.
		if (antallTimer > 40) {
			normallonn = Math.abs((antallTimer-overtidstimer) * timelonn);
		}
	double lonn = overtidslonn + normallonn;
	
System.out.println("------------------------------UKE1------------------------------");	
System.out.println("Navn:			" + 	navn +							 	"		");
System.out.println("Lønn,vanlig:		" + Math.abs(normallonn) + 				 	"		");
System.out.println("Lønn, overtid:		" + Math.abs(overtidslonn) + 		 	"		");
System.out.println("Totallønn:		" + 	Math.abs(lonn) +	"			");
System.out.println("------------------------------UKE1------------------------------\n");	
	
//B.2 

// Uke 2

 System.out.print("Vennligst tast inn antall timer jobbet uke 2: ");
	double antallTimer2 = tast.nextDouble(); 
System.out.println(""); //Linjeskift
	double overtidslonn2 = 0;
	double overtidstimer2 = 0;
	if (antallTimer2 > 40) {
			overtidstimer2 = (antallTimer2 - 40);
			overtidslonn2 =  overtidstimer2 * (timelonn * 1.5);
	}
	double normallonn2 = Math.abs(timelonn*antallTimer2); 
		if (antallTimer2 > 40) {
			normallonn2 = (antallTimer2-overtidstimer2) * timelonn;
		}
	double lonn2 = overtidslonn2 + normallonn2;
 
	
System.out.println("------------------------------UKE2------------------------------");	
System.out.println("Navn:			" + 	navn +							 	"		");
System.out.println("Lønn,vanlig:		" + Math.abs(normallonn2) + 				 	"		");
System.out.println("Lønn, overtid:		" + Math.abs(overtidslonn2) + 		 	"		");
System.out.println("Totallønn:		" + 	Math.abs(lonn2) +	"			");
System.out.println("------------------------------UKE2------------------------------\n");	

//Uke 3
System.out.print("Vennligst tast inn antall timer jobbet uke 3: ");
	double antallTimer3 = tast.nextDouble(); 
System.out.println(""); //Linjeskift
	double overtidslonn3 = 0;
	double overtidstimer3 = 0;
	if (antallTimer3 > 40) {
			overtidstimer3 = (antallTimer3 - 40);
			overtidslonn3 =  overtidstimer3 * (timelonn * 1.5);
	}
	double normallonn3 = Math.abs(timelonn*antallTimer3); 
		if (antallTimer3 > 40) {
			normallonn3 = (antallTimer3-overtidstimer3) * timelonn;
		}
	double lonn3 = overtidslonn3 + normallonn3;
 
	
System.out.println("------------------------------UKE3------------------------------");	
System.out.println("Navn:			" + 	navn +							 	"		");
System.out.println("Lønn,vanlig:		" + Math.abs(normallonn3) + 				 	"		");
System.out.println("Lønn, overtid:		" + Math.abs(overtidslonn3) + 		 	"		");
System.out.println("Totallønn:		" + 	Math.abs(lonn3) +	"			");
System.out.println("------------------------------UKE3------------------------------\n");	
	
//Uke 4
System.out.print("Vennligst tast inn antall timer jobbet uke 4: ");
	double antallTimer4 = tast.nextDouble(); 
System.out.println(""); //Linjeskift
	double overtidslonn4 = 0;
	double overtidstimer4 = 0;
	if (antallTimer4 > 40) {
			overtidstimer4 = (antallTimer4 - 40);
			overtidslonn4 =  overtidstimer4 * (timelonn * 1.5);
	}
	double normallonn4 = Math.abs(timelonn*antallTimer); 
		if (antallTimer4 > 40) {
			normallonn4 = (antallTimer4-overtidstimer4) * timelonn;
		}
	double lonn4 = overtidslonn4+ normallonn4;
 
	
System.out.println("------------------------------UKE4------------------------------");	
System.out.println("Navn:			" + 	navn +							 	"		");
System.out.println("Lønn,vanlig:		" + Math.abs(normallonn4) + 				 	"		");
System.out.println("Lønn, overtid:		" + Math.abs(overtidslonn4) + 		 	"		");
System.out.println("Totallønn:		" + 	Math.abs(lonn4) +	"			");
System.out.println("------------------------------UKE4------------------------------\n");	

//Total - Måned

double normallonnMaaned = Math.abs(normallonn + normallonn2 + normallonn3 + normallonn4);
double overtidslonnMaaned = Math.abs(overtidslonn + overtidslonn2 + overtidslonn3 + overtidslonn4);
double totallonnMaaned = Math.abs(lonn + lonn2 + lonn3 + lonn4);
System.out.println("Din totale lønn forrige måned var\n ");
System.out.println("------------------------------UKE1-4------------------------------");
System.out.println("Navn:			" + 	navn +							 	"		");
System.out.println("Lønn,vanlig:		" + Math.abs(normallonnMaaned) + 				 	"		");
System.out.println("Lønn, overtid:		" + Math.abs(overtidslonnMaaned) + 		 	"		");
System.out.println("Totallønn:		" + 	Math.abs(totallonnMaaned) +	"			");
System.out.println("------------------------------UKE1-4------------------------------");

	

	} //Slutt på metoden main
} //Slutt på klassen Oblig1B
