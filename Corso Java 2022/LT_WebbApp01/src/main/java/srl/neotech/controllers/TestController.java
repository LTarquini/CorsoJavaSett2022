package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value="listMusic")
	public String LT_MusicStore() {
	return "LT_MusicStore";
	}
@GetMapping(value="detailMusic")
public String detailMusic() {
return "LT_MusicStore";
}
}