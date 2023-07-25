package org.lessons.java.shop;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

/*Create una classe Carrello con metodo main,
 in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore
 o Cuffie e
  in base alla scelta dell’utente richiamate il costruttore opportuno.
Al termine dell’inserimento stampate gli elementi del carrello (fate l’override del metodo toString nelle varie classi per restituire le informazioni da stampare)*/
public class Carrello {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // Creare una lista di oggetti Prodotto
        ArrayList<Prodotto> carrello = new ArrayList<>();
        boolean flag =false;
        while(!flag){
           // chiedere all' utente con uno switch cosa vuole inserire
           System.out.print(" che prodotto vuoi ? digita '1' per smarphone '2' per i televisori e '3' per le cuffie... ");
           String input = scan.nextLine();
           switch(input.toLowerCase()){
               case "1":
                   System.out.println("vuoi uno smartphone ??");
                   System.out.print("Inserisci il nome dello smartphone: ");
                   String name = scan.nextLine();

                   System.out.print("Inserisci la descrizione dello smartphone: ");
                   String description = scan.nextLine();

                   System.out.print("Inserisci il prezzo del prodotto: ");
                   BigDecimal price = scan.nextBigDecimal();

                   System.out.print("Inserisci l'IVA dello smartphone: ");
                   double iva = scan.nextDouble();


                   System.out.print("Inserisci il codice Imei dello smartphone: ");
                   String codiceImei = scan.next();
                   scan.nextLine();

                   System.out.print("Inserisci la memoria dello smartphone in gb: ");
                   int memory = Integer.parseInt(scan.nextLine());

                   Smartphone smartPhone = new Smartphone(name, description, price, iva, codiceImei, memory);
                   System.out.println(smartPhone);
                   carrello.add(smartPhone);
                   break;
               case "2":
                   System.out.println("inserimento televisore");
                   System.out.print("Inserisci il nome della televisione: ");
                   String nameTele = scan.nextLine();

                   System.out.print("Inserisci la descrizione della televisione: ");
                   String descriptionTele = scan.nextLine();

                   System.out.print("Inserisci il prezzo del prodotto: ");
                   BigDecimal priceTele = scan.nextBigDecimal();

                   System.out.print("Inserisci l'IVA della televisione: ");
                   double ivaTele = scan.nextDouble();


                   System.out.print("Inserisci la dimensione in pollici della televisione: ");
                   int dimensioneTele = scan.nextInt();


                   System.out.print("Inserisci se la televisione è smart (true) o no (false): ");
                   boolean smart = scan.nextBoolean();
                   scan.nextLine();
                   Televisori television = new Televisori(nameTele, descriptionTele, priceTele, ivaTele, dimensioneTele, smart);

                   carrello.add(television);
                   break;
               case "3":
                   System.out.println("inserimento Cuffie");
                   System.out.print("Inserisci il nome delle cuffie: ");
                   String nameCuffie = scan.nextLine();

                   System.out.print("Inserisci la descrizione delle cuffie: ");
                   String descriptionCuffie = scan.nextLine();

                   System.out.print("Inserisci il prezzo delle cuffie : ");
                   BigDecimal priceCuffie = scan.nextBigDecimal();

                   System.out.print("Inserisci l'IVA della televisione: ");
                   double ivaCuffie = scan.nextDouble();
                   scan.nextLine();

                   System.out.print("Inserisci il colore delle cuffie: ");
                   String coloreCuffie = scan.nextLine();


                   System.out.print("Inserisci se le cuffie sono wireless (true) o cablate (false): ");
                   boolean wireless = scan.nextBoolean();
                   scan.nextLine();
                   Cuffie cuffia = new Cuffie(nameCuffie, descriptionCuffie, priceCuffie, ivaCuffie, coloreCuffie, wireless);

                   carrello.add(cuffia);
                   break;
               default:
                   flag=true;
                   System.out.println("prodotto non disponibile !!");
                   break;
           }

           System.out.print("Vuoi uscire ? (Y/N): ");
           String value = scan.nextLine();
           if(value.equalsIgnoreCase("Y")){
               flag=true;
               System.out.println("Grazie Mille !!! ");
           }
       }
        // costruire l' oggetto in base alla richiesta e relativi costruttori
        // stampare la lista dei prodotti utilizzando un tostring nelle sottoclassi
        for (Prodotto p : carrello){
            System.out.println(p);

        }
    }
}
