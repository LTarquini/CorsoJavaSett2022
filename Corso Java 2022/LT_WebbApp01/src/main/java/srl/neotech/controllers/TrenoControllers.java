package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.treno.Motore;
import srl.neotech.treno.treno;
@Controller
public class TrenoControllers {


@Autowired

treno motore;
@GetMapping(value="Treno")

	public String webApp() {

		return"Treno";
		Motore.getGt().setPotenza(50000);
		((Motore) Motore.getGt()).setNomeMarca("PMM");
		System.out.println(motore.getGt().getNomeMarca());
		
		
		return"Treno";
}
}