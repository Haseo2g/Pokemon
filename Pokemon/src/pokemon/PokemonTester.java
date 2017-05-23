/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author win7
 */
public class PokemonTester {

    private Pokemon charizard;
    private Pokemon blastoise;
    private Pokemon venusaur;

    public PokemonTester() {
        /* charizard = new Pokemon(100, 50, 50);
        blastoise = new Pokemon(150, 25, 150);
        venusaur = new Pokemon(300, 10, 100);*/
    }

    public static void main(String[] args) {
        PokemonTester tester = new PokemonTester();
        Pokemon.battle(tester.charizard, tester.blastoise); //will not compile
    }
}
