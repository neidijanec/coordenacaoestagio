package br.com.coordenacaoestagio.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/locais")
public class LocalResource {
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST éstá funcionando!";
	}

}
