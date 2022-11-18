package srl.neotech.corsojava.aereoporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {
    static List<Aereo> aereiInPartenza1=new ArrayList <Aereo>();
    static List<Aereo> aereiInAvvicinamento1=new ArrayList <Aereo>();
	public static void main(String[] args) {

	Aeroporto aereoporto=new Aeroporto();
	Random random=new Random();
    Faker faker=new Faker();

    for(int i=0; i<=100; i++) {

    Aereo aereoCheDecolla=new Aereo();

    Integer randomDistanzaAeroporto=random.nextInt(1,500);
    Integer randomVelocita=random.nextInt(1,10);
    String  compagnia=faker.company().name();
    Integer idUnivico=faker.number().randomDigit();

    aereoCheDecolla.setCompagniaAerea(compagnia);
    aereoCheDecolla.setIdUnivico(idUnivico);
    aereoCheDecolla.setDistanzaDallAeroporto(randomDistanzaAeroporto);
    aereoCheDecolla.setOrario(0);
    aereoCheDecolla.setVelocita(randomVelocita);

    aereoCheDecolla.setStato(aereiInPartenza.getStato().IN_PARTENZA);
    aereoCheDecolla1.add(aereoCheDecolla);
    }
    for(int j=0; j<=200; j++) {
    Aereo aereiInArrivo=new Aereo();

    String  compagnia=faker.company().name();
    Integer idUnivico=faker.number().randomDigit();
    Integer randomDistanzaAeroporto=random.nextInt(1,500);
    Integer randomVelocita=random.nextInt(1,10);
    Integer randomOrario=random.nextInt(1,140);

    aereiInArrivo.setCompagniaAerea(compagnia);
    aereiInArrivo.setIdUnivico(idUnivico);
    aereiInArrivo.setDistanzaDallAeroporto(randomDistanzaAeroporto);
    aereiInArrivo.setOrario(randomOrario);
    aereiInArrivo.setVelocita(randomVelocita);

    aereiInArrivo.setStato(aereiInArrivo.getStato().IN_AVVICINAMENTO);

    aereiInArrivo1.add(aereiInArrivo);
       }
    for(int k=0;k<=1000;k++) {
    Passeggero prontiPerCheckin=new Passeggero();

    Integer eta=faker.number().numberBetween(3, 90);
    Integer idUnivico=faker.number().randomDigit();

    prontiPerCheckin.setIdUnivoco(idUnivico);
    prontiPerCheckin.setEta(eta);

     Integer tipo=random.nextInt(1,3);

    if(tipo==1) prontiPerCheckin=new Business();
    else if(tipo==2) prontiPerCheckin=new Turista();
    else prontiPerCheckin=new Excelsior();
    }
   System.out.println("E' in partenza");
   for(Aereo aereoInPartenza:aereiInPartenza1) {
       System.out.println(aereoInPartenza);
   }
   System.out.println("E' in arrivo");
   for(Aereo aereoInArrivo:aereiInAvvicinamento1) {
       System.out.println(aereoInArrivo);
   }
    }
  }