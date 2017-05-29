/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import javax.swing.ImageIcon;

public class Pokemon {

    private String nome;
    private int id;
    private int hp;
    private int atk;
    private int spatk;
    private int def;
    private int spdef;
    private int spd;
    private String type1;
    private String type2;
    private ImageIcon pokeF;
    private ImageIcon pokeB;

    /**
     * Constructs the pokemon
     *
     * @param nome
     * @param id
     * @param hp
     * @param atk
     * @param def
     * @param spatk
     * @param spdef
     * @param spd
     * @param type1
     * @param type2
     * @param pokeF
     * @param pokeB
     */
    public Pokemon(String nome, int id, int hp, int atk, int def, int spatk, int spdef,
            int spd, String type1, String type2, ImageIcon pokeF, ImageIcon pokeB) {

        assert hp >= 1;
        assert hp <= 1000;
        assert atk >= 1;
        assert atk <= 1000;
        assert def >= 1;
        assert def <= 1000;
        assert spatk >= 1;
        assert spatk <= 1000;
        assert spdef >= 1;
        assert spdef <= 1000;
        assert spd >= 1;
        assert spd <= 1000;

        this.id = id;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.spd = spd;
        this.type1 = type1;
        this.type2 = type2;
        this.pokeF = pokeF;
        this.pokeB = pokeB;

    }

    Pokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Coment() {
        /*  public static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        do {
        /*    System.out.println(pokemon1 + " begins the fight against " + pokemon2);
            System.out.println(pokemon1 + " does " + pokemon1.strength + " damage to "
                    + pokemon2 + " and " + pokemon2 + " has " + pokemon2.health + " left.");
            System.out.println(pokemon2 + " does " + pokemon2.strength + " damage to "
                    + pokemon1 + " and " + pokemon1 + " has " + pokemon1.health + " left.");
        } while (pokemon1.health >= 1 || pokemon2.health >= 1);
        if (pokemon1.health < 1) {
            System.out.println(pokemon1 + " has lost the fight");
        } else {
            System.out.println(pokemon2 + " has lost the fight");
        }
    }*/
    }

    public ImageIcon getPokeF() {
        return pokeF;
    }

    public void setPokeF(ImageIcon pokeF) {
        this.pokeF = pokeF;
    }

    public ImageIcon getPokeB() {
        return pokeB;
    }

    public void setPokeB(ImageIcon pokeB) {
        this.pokeB = pokeB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpatk() {
        return spatk;
    }

    public void setSpatk(int spatk) {
        this.spatk = spatk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpdef() {
        return spdef;
    }

    public void setSpdef(int spdef) {
        this.spdef = spdef;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
//Até o 649 tem back certa. 
