package br.com.model.persistencia;

import br.com.model.negosio.Aluno;
import br.com.senai.persistencia.dao.AlunoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author clayson_medeiros
 */
public class AlunoDAOImpl extends DAOImpl<Aluno, Integer> implements AlunoDAO {

     public List<Aluno> getByNome (String nome){
        return getEntityManager().createQuery("select a from Aluno a where a.nome like '%"
                + nome+ "%'").getResultList();
    }
     
      public Aluno getAlunoByAnoObservacoes(int anoFabricacao, int anoModelo, String observacoes) {
        Query q = getEntityManager().createQuery("select a from Aluno a where a.anoFabricacao"
                + " like '" + anoFabricacao + "' and a.anoModelo like '" + anoModelo +
                "' and a.observacoes like '" + observacoes + "'", Aluno.class);
        List<Aluno> alunos = q.getResultList();
        Aluno ma = new Aluno();
        for (Aluno m : alunos) {
            ma = m;
        }
        return ma;

    }
 
   
}
