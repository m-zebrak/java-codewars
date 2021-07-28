package me.m_zebrak.kyu5;

/**
 * Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending machine; there are
 * no other people in the queue. The first one in the queue (Sheldon) buys a can, drinks it and doubles! The
 * resulting two Sheldons go to the end of the queue. Then the next in the queue (Leonard) buys a can, drinks it and
 * gets to the end of the queue as two Leonards, and so on.
 * <p>
 * For example, Penny drinks the third can of cola and the queue will look like this:
 * <p>
 * Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny
 * Write a program that will return the name of the person who will drink the n-th cola.
 * <p>
 * Input:
 * The input data consist of an array which contains at least 1 name, and single integer n which may go as high as
 * the biggest number your language of choice supports (if there's such limit, of course).
 * <p>
 * Output / Examples:
 * Return the single line — the name of the person who drinks the n-th can of cola. The cans are numbered starting
 * from 1.
 * <p>
 * let names = &vec![Name::Sheldon, Name::Leonard, Name::Penny, Name::Rajesh, Name::Howard];
 * assert_eq!(who_is_next(names, 1), Name::Sheldon);
 * assert_eq!(who_is_next(names, 6), Name::Sheldon);
 * assert_eq!(who_is_next(names, 52), Name::Penny);
 * assert_eq!(who_is_next(names, 7230702951), Name::Leonard);
 */
public class DoubleCola {
    public static String solution(String[] names, int n) {
        n--;
        while (n >= names.length)
            n = (n - names.length) / 2;

        return names[n];
    }
}
