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

import api.conecta.org.models.Login;
import api.conecta.org.repository.LoginRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Logins da Comunidade")
@CrossOrigin(origins = "*")
public class LoginResource {
	@Autowired
	LoginRepository loginRepository;

	@GetMapping("/logins")
	@ApiOperation(value = "Retorna uma lista de Logins da Comunidade")
	public List<Login> listaLogins() {
		return loginRepository.findAll();
	}

	@GetMapping("/login/{id}")
	@ApiOperation(value = "Retorna um login específico")
	public Login listaLogin(@PathVariable(value = "id") long id) {
		return loginRepository.findById(id);
	}

	@GetMapping("/login/{nome}")
	@ApiOperation(value = "Retorna um usuário específico")
	public Login listaLogin(@PathVariable(value = "nome") String nome) {
		return loginRepository.findByUsuario(nome);
	}
	
	@PostMapping("/login")
	@ApiOperation(value = "Salva um login")
	public Login salvarLogin(@RequestBody Login login) {
		return loginRepository.save(login);
	}

	@DeleteMapping("/login")
	@ApiOperation(value = "Apaga um login específico")
	public void deletarLogin(@RequestBody Login login) {
		loginRepository.delete(login);
	}

	@PutMapping("/login")
	@ApiOperation(value = "Altera um login específico")
	public Login alterarLogin(@RequestBody Login login) {
		return loginRepository.save(login);
	}

}
