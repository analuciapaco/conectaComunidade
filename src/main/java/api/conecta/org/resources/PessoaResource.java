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

import api.conecta.org.models.Pessoa;
import api.conecta.org.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Pessoa da Comunidade")
@CrossOrigin(origins = "*")
public class PessoaResource {
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/pessoas")
	@ApiOperation(value = "Retorna uma lista de Pessoas da Comunidade")
	public List<Pessoa> listaPessoas() {
		return pessoaRepository.findAll();
	}

	@GetMapping("/pessoa/{id}")
	@ApiOperation(value = "Retorna uma pessoa específica")
	public Pessoa listaPessoa(@PathVariable(value = "id") long id) {
		return pessoaRepository.findById(id);
	}

	@PostMapping("/pessoa")
	@ApiOperation(value = "Salva uma pessoa")
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@DeleteMapping("/pessoa")
	@ApiOperation(value = "Apaga uma pessoa específica")
	public void deletarPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}

	@PutMapping("/pessoa")
	@ApiOperation(value = "Altera uma pessoa específica")
	public Pessoa alterarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}
