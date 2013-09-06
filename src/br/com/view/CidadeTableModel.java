package br.com.view;

import br.com.model.negosio.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clayson_medeiros
 */
public class CidadeTableModel extends AbstractTableModel {

    private static final int COL_CODIGO = 0;
    private static final int COL_NOME = 1;
    private static final int COL_UF = 2;
    
    private List<Cidade> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome", "UF"};

    //Cria uma AutomovelTableModel sem nenhuma linha
    public CidadeTableModel() {
        linhas = new ArrayList<Cidade>();
    }

    //Cria uma AutomovelTableModel contendo a lista recebida por parâmetro.
    public CidadeTableModel(List<Cidade> cidades) {
        this.linhas = new ArrayList<Cidade>(cidades);
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
        if (columnIndex == COL_CODIGO) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return Integer.class;
        } else if (columnIndex == COL_UF) {
            return Integer.class;
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
        Cidade cidade = linhas.get(row);
        //verifica qual valor deve ser retornado
        if (column == COL_CODIGO) {
            return cidade.getCodigo();
        } else if (column == COL_NOME) {
            return cidade.getNome();
        } else if (column == COL_UF) {
            return cidade.getUf();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Cidade cidade = linhas.get(row);
        if (column == COL_CODIGO) {
            cidade.setCodigo((Integer) aValue);
        } else if (column == COL_NOME) {
            cidade.setNome((String) aValue);
        } else if (column == COL_UF) {
            cidade.setUf((String) aValue);
        } 
    }

    // Retorna a marca referente a linha especificada
    public Cidade getAutomovel(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao automovel
    public void addAutomovel(Cidade cidade) {
        // Adiciona o registro.
        linhas.add(cidade);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
//        ordenarPorAnoFabricacao();

    }

    public void updateCidade(int indiceLinha, Cidade cidade) {
        linhas.set(indiceLinha, cidade);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
//        ordenarPorAnoFabricacao();
    }

    //Remove o sócio da linha especificada.
    public void removeCidade(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
//        ordenarPorAnoFabricacao();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
