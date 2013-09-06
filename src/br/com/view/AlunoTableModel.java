package br.com.view;

import br.com.model.negosio.Aluno;
import br.com.model.negosio.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clayson_medeiros
 */
public class AlunoTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_CIDADE = 2; 
    private List<Aluno> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome", "Cidade"};
    //Cria uma AutomovelTableModel sem nenhuma linha
    public AlunoTableModel() {
        linhas = new ArrayList<Aluno>();
    }

    //Cria uma AlunoTableModel contendo a lista recebida por parâmetro.
    public AlunoTableModel(List<Aluno> alunos) {
        this.linhas = new ArrayList<Aluno>(alunos);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return Integer.class;
        } else if (columnIndex == COL_CIDADE) {
            return Cidade.class;
        }
        
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a marca da linha
        Aluno m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getCodigo();
        } else if (column == COL_NOME) {
            return m.getNome();
        } else if (column == COL_CIDADE) {
            return m.getCidade();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Aluno u = linhas.get(row);
        if (column == COL_ID) {
            u.setCodigo((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome((String) aValue);
        } else if (column == COL_CIDADE) {  
            u.setCidade((Cidade) aValue);
        }
    }

    // Retorna a marca referente a linha especificada
    public Aluno getAluno(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao automovel
    public void addAluno(Aluno aluno) {
        // Adiciona o registro.
        linhas.add(aluno);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
   }

    public void updateAluno(int indiceLinha, Aluno aluno) {
        linhas.set(indiceLinha, aluno);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);        
    }

    //Remove o sócio da linha especificada.
    public void removeAluno(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);        
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
