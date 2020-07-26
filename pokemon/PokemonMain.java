/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Haseo - Isa
 */
public class PokemonMain implements ActionListener {

    /*String nome, int id, int hp, int atk, int def, int spatk, int spdef, 
            int spd,String type1, String type2, ImageIcon pokeF, ImageIcon pokeB*/
    private JTextField txtNome = new JTextField();
    private JTextField txtType1 = new JTextField();
    private JTextField txtType2 = new JTextField();
    private JTextField txtHp = new JTextField();
    private PokemonMain model = new PokemonMain();
    private JTable table;

    public PokemonMain() {
        JFrame janela = new JFrame("Team Setup");
        JPanel panPrincipal = new JPanel(new BorderLayout());
        JPanel panBotoes = new JPanel(new GridLayout(2, 2));
        JPanel panTeam = new JPanel(new GridLayout(3, 2));
        JPanel panPoke = new JPanel(new GridLayout(2, 2));

        janela.setContentPane(panPrincipal);

        panPrincipal.add(panTeam, BorderLayout.CENTER);
        panPrincipal.add(panBotoes, BorderLayout.SOUTH);

        panTeam.add(panPoke);
        panTeam.add(panPoke);
        panTeam.add(panPoke);
        panTeam.add(panPoke);
        panTeam.add(panPoke);
        panTeam.add(panPoke);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(this);

        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.addActionListener(this);

        panBotoes.add(btnAdicionar);
        panBotoes.add(btnPesquisar);

        janela.setSize(800, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Pokemon PokemonMain() {
        Pokemon a = new Pokemon();
        a.setNome(txtNome.getText());
        a.setEspecie(txtEspecie.getText());
        a.setRaca(txtRaca.getText());
        a.setGenero(txtGenero.isSelected());
        a.setPeso(Float.parseFloat(txtPeso.getText()));
        try {
            a.setNascimento(sdf.parse(txtNascimento.getText()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Data inv�lida");
            a = null;
        }
        return a;
    }

    public void animalToForm(Pokemon a) {
        txtNome.setText(a.getNome());
        txtRaca.setText(a.getRaca());
        txtEspecie.setText(a.getEspecie());
        txtPeso.setText(String.valueOf(a.getPeso()));
        txtNascimento.setText(sdf.format(a.getNascimento()));
        txtGenero.setSelected(a.isGenero());
    }

    public static void main(String[] args) {
        new PokemonMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ("Adicionar".equals(cmd)) {
            Pokemon a = formToAnimal();
            if (a != null) {
                model.adicionar(a);
                table.invalidate();
                table.revalidate();
                table.repaint();
            }
        } else if ("Pesquisar".equals(cmd)) {
            Pokemon a = model.pesquisarPorNome(txtNome.getText());
            animalToForm(a);
        }
    }

}

}
