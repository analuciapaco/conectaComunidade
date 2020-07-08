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

import api.conecta.org.models.Familia;
import api.conecta.org.repository.FamiliaRepository;
import api.conecta.org.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Familias da Comunidade")
@CrossOrigin(origins = "*")
public class FamiliaResource {
	@Autowired
	FamiliaRepository familiaRepository;
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/familias")
	@ApiOperation(value = "Retorna uma lista de famílias da Comunidade")
	public List<Familia> listaFamilias() {
		return familiaRepository.findAll();
	}

	@GetMapping("/familia/{id}")
	@ApiOperation(value = "Retorna um família especifica")
	public Familia listaUmaFamilia(@PathVariable(value = "id") long id) {
		return familiaRepository.findById(id);

	}

	@PostMapping("/familia")
	@ApiOperation(value = "Salva uma família")
	public Familia salvarFamilia(@RequestBody Familia familia) {
		pessoaRepository.save(familia.getLiderDeRua());
		pessoaRepository.save(familia.getRepresentanteFamilia());
		return familiaRepository.save(familia);
	}

	@DeleteMapping("/familia")
	@ApiOperation(value = "Apaga uma família específica")
	public void deletarFamilia(@RequestBody Familia familia) {
		familiaRepository.delete(familia);
	}

	@PutMapping("/familia")
	@ApiOperation(value = "Altera uma família específica")
	public Familia alterarFamilia(@RequestBody Familia familia) {
		pessoaRepository.save(familia.getLiderDeRua());
		pessoaRepository.save(familia.getRepresentanteFamilia());
		return familiaRepository.save(familia);
	}

}
