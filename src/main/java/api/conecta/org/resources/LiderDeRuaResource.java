/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.conecta.org.models.LiderDeRua;
import api.conecta.org.repository.LiderDeRuaRepository;
import api.conecta.org.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Lideres de Rua da Comunidade")
@CrossOrigin(origins = "*")
public class LiderDeRuaResource {
	@Autowired
	LiderDeRuaRepository liderDeRuaRepository;
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/lideresDeRua")
	@ApiOperation(value = "Retorna uma lista de Líderes de Rua")
	public List<LiderDeRua> listaLideresDeRua() {
		return liderDeRuaRepository.findAll();
	}

	@GetMapping("/liderDeRua/{id}")
	@ApiOperation(value = "Retorna um líder de rua específico")
	public LiderDeRua listaLiderDeRua(@PathVariable(value = "id") long id) {
		return liderDeRuaRepository.findById(id);
	}

	@PostMapping("/liderDeRua")
	@ApiOperation(value = "Salva um líder de rua específico")
	public LiderDeRua salvarLiderDeRua(@RequestBody LiderDeRua liderDeRua) {
		pessoaRepository.save(liderDeRua.getPessoa());
		pessoaRepository.save(liderDeRua.getAgenteComunitario());
		return liderDeRuaRepository.save(liderDeRua);
	}

	@DeleteMapping("/liderDeRua")
	@ApiOperation(value = "Apaga um líder de rua específico")
	public void deletarLiderDeRua(@RequestBody LiderDeRua liderDeRua) {
		liderDeRuaRepository.delete(liderDeRua);
	}

	@PutMapping("/liderDeRua")
	@ApiOperation(value = "Altera um líder de rua específico")
	public LiderDeRua alterarLiderDeRua(@RequestBody LiderDeRua liderDeRua) {
		pessoaRepository.save(liderDeRua.getPessoa());
		pessoaRepository.save(liderDeRua.getAgenteComunitario());
		return liderDeRuaRepository.save(liderDeRua);
	}

}
