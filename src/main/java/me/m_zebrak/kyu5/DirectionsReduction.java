package me.m_zebrak.kyu5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Once upon a time, on a way through the old wild mountainous west,…
 * … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST"
 * . Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
 * <p>
 * Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the
 * wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you
 * might die of thirst!
 * <p>
 * How I crossed a mountainous desert the smart way.
 * The directions given to the man are, for example, the following (depending on the language):
 * <p>
 * ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
 * or
 * { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
 * or
 * [North, South, South, East, West, North, West]
 * You can immediatly see that going "NORTH" and immediately "SOUTH" is not reasonable, better stay to the same
 * place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:
 * <p>
 * ["WEST"]
 * or
 * { "WEST" }
 * or
 * [West]
 * Other examples:
 * In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.
 * <p>
 * The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is []
 * (nil in Clojure).
 * <p>
 * In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they
 * become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
 */
public class DirectionsReduction {
    public static String[] solution(String[] strings) {
        ArrayList<String> list = new ArrayList(Arrays.asList(strings));

        for (int i = 0; i < list.size() - 1; i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(list.get(i) + list.get(i + 1))) {
                list.remove(i);
                list.remove(i);
                i = -1;
            }
        }

        return list.toArray(String[]::new);
    }
}