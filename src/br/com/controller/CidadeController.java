

package br.com.controller;

import br.com.model.negosio.Cidade;
import br.com.model.persistencia.CidadeDAOImpl;
import br.com.model.persistencia.DAOImpl;
import br.com.senai.persistencia.dao.CidadeDAO;
import br.com.senai.persistencia.dao.DAO;
import java.util.List;




/**
 *
 * @author clayson_medeiros
 */
public class CidadeController {    
    
     public boolean salvar(Cidade cidade) {
        DAO dao = new DAOImpl() {};
        return dao.save(cidade);
    }

    public boolean excluir(int id) {
        DAO dao = new DAOImpl() {};
        return dao.remove(Cidade.class, id);
    }
    
    public List<Cidade> listarCidade() {
        DAO dao = new DAOImpl() {};
        return dao.getAll(Cidade.class);
    }
    
    public Cidade listarCidadeById (int id){
        CidadeDAO dao = new CidadeDAOImpl();
        return dao.getById(Cidade.class, id);
    }
    
   public List<Cidade> listarCidadeByNome (String nome){
        CidadeDAO dao = new CidadeDAOImpl();
        return dao.getByNome(nome);
    }
}
