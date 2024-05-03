package com.salesianostriana.dam.ejemploconramas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	
	@GetMapping("/nuevo")
	public String showFormNuevoCurso() {
		// Mostrar el formulario de nuevo curso
		return "";		
	}
	
	@PostMapping("/nuevo/submit")
	public String submitFormNuevoCurso() {
		// Procesar formulario nuevo curso
		return "";
	}

}
