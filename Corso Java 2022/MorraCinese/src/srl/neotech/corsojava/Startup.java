package srl.neotech.corsojava;

public class Startup {

	public static void main(String[] args) {

    String nome =  "Sasso";
    String nome1 = "Carta";
    String nome2 = "Forbici";
    
    if(nome == "Sasso") {
    System.out.println("Sasso batte forbici");
    }else if(nome == "Carta") {
        System.out.println("Carta batte sasso");
        if(nome == "Forbici") {
            System.out.println("Forbici batte carta");
      }
    }
	if(nome1 == "Carta") {
    System.out.println("Carta batte sasso");
    }else if(nome == "Sasso") {
        System.out.println("Sasso batte forbici");
         if(nome == "Forbici") {
            System.out.println("Forbici batte carta");
         }       
    }  
	if(nome2 == "Forbici") {
    System.out.println("Forbici batte carta");
    }else if(nome == "Sasso") {
        System.out.println("Sasso batte forbici");
         if(nome == "Forbici") {
            System.out.println("Forbici batte carta");
         }
    }
  }
}






