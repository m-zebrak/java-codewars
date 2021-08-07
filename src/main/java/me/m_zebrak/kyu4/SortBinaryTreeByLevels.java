package me.m_zebrak.kyu4;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * You are given a binary tree:
 * (An additional class that is already implemented on codewars site, if you are pasting it into codewars complier,
 * you could ignore it)
 */
class Node {
    Node left;
    Node right;
    int value;

    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}

/**
 * Your task is to return the list with elements from tree sorted by levels, which means the root element goes first, then root children (from left to right) are second and third, and so on.
 * <p>
 * Return empty list is root is 'null'.
 * <p>
 * Example 1 - following tree:
 * <p>
 * 2
 * 8        9
 * 1  3     4   5
 * Should return following list:
 * <p>
 * [2,8,9,1,3,4,5]
 * Example 2 - following tree:
 * <p>
 * 1
 * 8        4
 * 3        5
 * 7
 * Should return following list:
 * <p>
 * [1,8,4,3,5,7]
 */
public class SortBinaryTreeByLevels {
    public static List<Integer> solution(Node node) {
        List<Integer> result = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        if (node != null) queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.remove();
            result.add(node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return result;
    }
}
