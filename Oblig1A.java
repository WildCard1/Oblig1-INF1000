/* 
Denne oppgaven er skrevet av Henrik Hansen for INF1000 grp16.
Denne filen inneholder oppgave A.1 og deretter A.2.
Oppgaven går ut på å regne med regndager vs regn og måneder.
*/

//A.1

class Oblig1A {
	public static void main(String[]args) {
	int regndagerMai = 13;
	int regnMai = 59;
	int regndagerJuni = 20;
	int regnJuni = 94;
	int regndagerJuli = 21;
	int regnJuli = 149; 
	
	String fortekst1 = "I mai, juni og juli 2012 var det totalt nedbør på: ";
		int totaltRegn = (regnMai + regnJuni + regnJuli);
		System.out.println(fortekst1 + totaltRegn +"mm regn\n");
	
	String fortekst2 = "Gjennomsnittlig daglig nedbør de dagene det regnet i mai, juni og juli 2012 var ";
		int totaltRegndager = (regndagerMai + regndagerJuni + regndagerJuli);
		int regnGjennomsnitt = totaltRegn / totaltRegndager;
		System.out.println(fortekst2 + regnGjennomsnitt + "mm regn\n");	
	
	String fortekst3 = "Det var på prosentvis økning i juli 2012 i forhold til normalnedboren i juli på: ";
		double normalnedbor = 81;
		double okningNormalnedbor = Math.abs((regnJuli/normalnedbor*100)-100);
		System.out.println(fortekst3 + Math.ceil(okningNormalnedbor) + "%\n" );
	
	//A.2
	
	double gjennomsnittMai = Math.abs(regnMai/regndagerMai);
	double gjennomsnittJuni = Math.abs(regnJuni/regndagerJuni);
	double gjennomsnittJuli = Math.abs(regnJuli/regndagerJuli);
	
	
	if (gjennomsnittMai > gjennomsnittJuni && gjennomsnittMai > gjennomsnittJuli) {
		System.out.print("Mai hadde de våteste dager med et gjennomsnitt\n");
		System.out.println("på " + Math.floor(gjennomsnittMai) + "mm regn per regndag"); //Bruker Math.floor for å regne ned til nærmest heltall. Ditto på de to andre.
	} //Slutt på if
	if (gjennomsnittJuni > gjennomsnittMai && gjennomsnittJuni > gjennomsnittJuli) {
		System.out.print("Juni hadde de våteste dager med et gjennomsnitt\n");
		System.out.println("på " + Math.floor(gjennomsnittJuni) + "mm regn per regndag");
	} //Slutt på if
	if (gjennomsnittJuli > gjennomsnittMai && gjennomsnittJuli > gjennomsnittJuni) {
		System.out.print("Juli hadde de våteste dager med et gjennomsnitt\n");
		System.out.println("på " + Math.floor(gjennomsnittJuli) + "mm regn per regndag");
	} //Slutt på if
	
	} //Slutt på metoden main
} //Slutt på klassen ObligA1
