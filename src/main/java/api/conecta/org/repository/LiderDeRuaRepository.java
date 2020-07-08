/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.conecta.org.models.LiderDeRua;

public interface LiderDeRuaRepository extends JpaRepository<LiderDeRua, Long> {

	LiderDeRua findById(long id);

}
