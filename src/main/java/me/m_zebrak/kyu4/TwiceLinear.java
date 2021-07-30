package me.m_zebrak.kyu4;

import java.util.TreeSet;

/**
 * Consider a sequence u where u is defined as follows:
 * <p>
 * The number u(0) = 1 is the first one in u.
 * For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
 * There are no other numbers in u.
 * Example:
 * u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]
 * <p>
 * 1 gives 3 and 4, then 3 gives 7 and 10, 4 gives 9 and 13, then 7 gives 15 and 22 and so on...
 * <p>
 * Task:
 * Given parameter n the function dbl_linear (or dblLinear...) returns the element u(n) of the ordered sequence u
 * (ordered with < so there are no duplicates) .
 * <p>
 * Example:
 * dbl_linear(10) should return 22
 */
public class TwiceLinear {
    public static int solution(int n) {
        TreeSet<Integer> set = new TreeSet<>() {{
            add(1);
        }};
        int x;
        for (int i = 0; i < n; i++) {
            x = set.pollFirst();
            set.add(2 * x + 1);
            set.add(3 * x + 1);
        }
        return set.first();
    }

    public static int solution2(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;

        int x = 0;
        int y = 0;
        int a, b;
        int k = 1;

        while (k <= n) {
            a = 2 * nums[x] + 1;
            b = 3 * nums[y] + 1;

            if (a > b) {
                nums[k++] = b;
                y++;
            } else {
                nums[k++] = a;
                x++;
                if (a == b) y++;
            }
        }
        return nums[n];
    }
}
