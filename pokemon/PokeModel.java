package pokemon;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Haseo - Isa
 */
public class PokeModel implements TableModel {

    private List<Pokemon> lista = new ArrayList<>();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "#";
            case 1:
                return "Pokemon";
            case 2:
                return "HP mínimo";
            case 3:
                return "Atk mínimo";
            case 4:
                return "Def mínima";
            case 5:
                return "Sp. Atk mínimo";
            case 6:
                return "Sp. Def mínima";
            case 7:
                return "Spd mínima";
            case 8:
                return "Tipo 1";
            case 9:
                return "Tipo 2";
            case 10:
                return "Imagem";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return Integer.class;
            case 6:
                return Integer.class;
            case 7:
                return Integer.class;
            case 8:
                return String.class;
            case 9:
                return String.class;
            case 10:
                return ImageIcon.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pokemon p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNome();
            case 2:
                return p.getHp();
            case 3:
                return p.getAtk();
            case 4:
                return p.getDef();
            case 5:
                return p.getSpatk();
            case 6:
                return p.getSpdef();
            case 7:
                return p.getSpd();
            case 8:
                return p.getType1();
            case 9:
                return p.getType2();
            case 10:
                return p.getPokeF();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pokemon pesquisarPorNome(String nome) {
        for (Pokemon p : lista) {
            if (p.getNome().contains(nome)) {
                return p;
            }
        }
        return new Pokemon();
    }

    public void adicionar(Pokemon a) {
        lista.add(a);
    }

}
