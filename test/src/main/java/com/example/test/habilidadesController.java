package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class habilidadesController {
	
	@GetMapping("/")
	public String index(Model model) {
		habilidades habilidade = new habilidades();

		habilidade.setJava(90);
        habilidade.setSpring(85);
        habilidade.setDb(85);
        habilidade.setCss(80);
        habilidade.setHtml(75);
        habilidade.setLide(75);
        habilidade.setCom(85);
        habilidade.setAdap(65);
        habilidade.setPyth(55);
        habilidade.setTeq(85);
     model.addAttribute("habilidade", new habilidades()); // objeto vazio
     return "index";
	}
}

