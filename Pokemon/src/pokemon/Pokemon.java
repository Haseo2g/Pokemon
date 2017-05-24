/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

public class Pokemon {

    private int id;
    private int hp;
    private int atk;
    private int spatk;
    private int def;
    private int spdef;
    private int spd;

    /**
     * Constructs the pokemon
     *
     * @Require: health is an integer greater than or equal to 1 but less than
     * or equal to 300 strength is and integer greater than or equal to 1 but
     * less than or equal to 300 speed is an integer greater than or equal to 1
     * but less than or equal to 300
     */
    public Pokemon(int id, int hp, int atk, int def, int spatk, int spdef, int spd) {
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
    }

    public static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        do {
            System.out.println(pokemon1 + " begins the fight against " + pokemon2);
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
    }

}
