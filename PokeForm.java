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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Haseo - Isa
 */
public class PokeForm implements ActionListener {

    PokemonList pkmn = new PokemonList();

    private JTextField txtNome = new JTextField();
    private JTextField txtID = new JTextField();
    private JTextField txtHP = new JTextField();
    private JTextField txtAtk = new JTextField();
    private JTextField txtSpAtk = new JTextField();
    private JTextField txtDef = new JTextField();
    private JTextField txtSpDef = new JTextField();
    private JTextField txtSpd = new JTextField();
    private JTextField txtType1 = new JTextField();
    private JTextField txtType2 = new JTextField();
    private PokeModel model;
    private JTable table;

    public PokeForm() {

        JFrame janela = new JFrame("Pokedéx");
        JPanel panPrincipal = new JPanel(new BorderLayout());
        JPanel panBotoes = new JPanel(new GridLayout(1, 2));
        JPanel panInfo = new JPanel(new GridLayout(3, 6));
        JPanel panType = new JPanel(new GridLayout(1, 2));

        janela.setContentPane(panPrincipal);

        JScrollPane scroll = new JScrollPane();
        model = new PokeModel(pkmn.getPokemons());
        table = new JTable(model);
        scroll.getViewport().add(table);

        panPrincipal.add(panInfo, BorderLayout.NORTH);
        panPrincipal.add(scroll, BorderLayout.CENTER);
        panPrincipal.add(panBotoes, BorderLayout.SOUTH);

        panInfo.add(new JLabel("ID"));
        panInfo.add(txtID);
        panInfo.add(new JLabel("Hp"));
        panInfo.add(txtHP);
        panInfo.add(new JLabel("Spd"));
        panInfo.add(txtSpd);
        panInfo.add(new JLabel("Pokemon"));
        panInfo.add(txtNome);
        panInfo.add(new JLabel("Atk"));
        panInfo.add(txtAtk);
        panInfo.add(new JLabel("Def"));
        panInfo.add(txtDef);
        panInfo.add(new JLabel("Sp. Atk"));
        panInfo.add(txtSpAtk);
        panInfo.add(new JLabel("Sp. Def"));
        panInfo.add(txtSpDef);
        panInfo.add(new JLabel("Tipo"));
        panInfo.add(panType);

        panType.add(txtType1);
        panType.add(txtType2);

        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.addActionListener(this);

        JButton btnSair = new JButton("Adicionar");

        panBotoes.add(btnPesquisar);
        panBotoes.add(btnSair);

        janela.setSize(800, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   /* public void PokeToForm(Pokemon a) {
        txtID.setText(String.valueOf(a.getId()));
        txtNome.setText(a.getNome());
        txtHP.setText(String.valueOf(a.getHp()));
        txtAtk.setText(String.valueOf(a.getAtk()));
        txtDef.setText(String.valueOf(a.getDef()));
        txtSpAtk.setText(String.valueOf(a.getSpatk()));
        txtSpDef.setText(String.valueOf(a.getSpdef()));
        txtSpd.setText(String.valueOf(a.getSpd()));
        txtType1.setText(a.getType1());
        txtType2.setText(a.getType2());
    }

    public Pokemon formPoke() {

        Pokemon p = new Pokemon();
        
        p.setId(Integer.parseInt(txtID.getText()));
        p.setNome(txtNome.getText());
        p.setHp(Integer.parseInt(txtHP.getText()));
        p.setAtk(Integer.parseInt(txtAtk.getText()));
        p.setDef(Integer.parseInt(txtDef.getText()));
        p.setSpatk(Integer.parseInt(txtSpAtk.getText()));
        p.setSpdef(Integer.parseInt(txtSpDef.getText()));
        p.setSpd(Integer.parseInt(txtSpd.getText()));
        p.setType1(txtType1.getText());
        p.setType2(txtType2.getText());
        return p;

    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
       /* String cmd = e.getActionCommand();
        if ("Adicionar".equals(cmd)) {
            Pokemon p = formPoke();
            if (p != null) {
                model.adicionar(p);
                table.invalidate();
                table.revalidate();
                table.repaint();
            }
        } else if ("Pesquisar".equals(cmd)) {
            Pokemon p = model.pesquisarPorNome(txtNome.getText());
            PokeToForm(p);
        }*/

    }

    public static void main(String[] args) {
        new PokeForm();

    }
}
