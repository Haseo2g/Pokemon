package pokemon;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Haseo - Isa
 */
public class PokeModel extends AbstractTableModel {

    private List<Pokemon> lista = new ArrayList<>();

    public PokeModel(ArrayList<Pokemon> lista) {
        this.lista = lista;
    }

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
                return getValueAt(0, columnIndex).getClass();
            //return JPanel.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /*public class PokeImage extends JFrame {

        JPanel contentPane;
        JLabel imageLabel = new JLabel();
        Pokemon p = new Pokemon();

        public PokeImage() {
            try {
                contentPane = (JPanel) getContentPane();
                //contentPane.setLayout(new BorderLayout());
               // setSize(new Dimension(200, 200));
                ImageIcon ii = p.getPokeB();
                imageLabel.setIcon(ii);
                contentPane.add(imageLabel);
                // show it
                //this.setLocationRelativeTo(null);
                this.setVisible(true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }*/ // talvez ainda funcione com umas alterações.
    
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
                return p.getPokeB();
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

/*static class IconRenderer extends DefaultTableCellRenderer {

        public IconRenderer() {
            super();
        }

        public void setValue(Object value) {
            if (value == null) {
                setText("");
            } else {
                setIcon((Icon) value);
            }
        }
    }*/ //fail 1
/*private JPanel loadingPanel() {
        Pokemon p = new Pokemon();
        JPanel panel = new JPanel();
        BoxLayout layoutMgr = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(layoutMgr);

        ClassLoader cldr = this.getClass().getClassLoader();
        java.net.URL imageURL = cldr.getResource("001.gif");
        ImageIcon imageIcon = new ImageIcon(imageURL);
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(imageIcon);
        imageIcon.setImageObserver(iconLabel);

        JLabel label = new JLabel("Loading...");
        panel.add(iconLabel);
        panel.add(label);
        return panel;
    }*/ //fail 2
