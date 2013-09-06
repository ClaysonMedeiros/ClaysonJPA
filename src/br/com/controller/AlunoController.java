package br.com.controller;

import br.com.model.negosio.Aluno;
import br.com.model.persistencia.AlunoDAOImpl;
import br.com.senai.persistencia.dao.AlunoDAO;
import java.util.List;


/**
 *
 * @author clayson_medeiros
 */
public class AlunoController {
    
    
     public boolean salvar(Aluno aluno) {
       AlunoDAO dao = new AlunoDAOImpl();
       return dao.save(aluno);
       
    }

    public boolean excluir(int id) {
        AlunoDAO dao = new AlunoDAOImpl();
        return dao.remove(Aluno.class, id);

    }
    
    public List<Aluno> listarAluno() {
        AlunoDAO dao = new AlunoDAOImpl();
        return dao.getAll(Aluno.class);
    }
    
    public Aluno listarAlunoById (int id){
        AlunoDAO dao = new AlunoDAOImpl();
        return dao.getById(Aluno.class, id);
    }
    
  public List<Aluno> listarAlunoByNome (String nome){
        AlunoDAO dao = new AlunoDAOImpl();
       return dao.getByNome(nome);
   }
   
//   public Aluno listarAlunoByAnoObservacoes(int anoFabricacao, int anoModelo, String observacoes){
//       AlunoDAO dao = new AlunoDAOImpl();
//       return dao.getAlunoByAnoObservacoes(anoFabricacao, anoModelo, observacoes);
//   }  
}
