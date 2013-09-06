

package br.com.senai.persistencia.dao;

import br.com.model.negosio.Aluno;
import java.util.List;

/**
 *
 * @author Clayson_medeiros
 */
public interface AlunoDAO extends DAO<Aluno, Integer>{
      
   List<Aluno> getByNome (String nome);
   // Aluno getAutomovelByAnoObservacoes(int anoFabricacao, int anoModelo, String observacoes);
}
