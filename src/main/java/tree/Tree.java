package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tree {
    public Node root;
    public Integer highLevel = 0;

    public Tree(ArrayList<String> functions, Set<Integer> points) {
        this.root = new Node(functions, points, -1);
    }

    private void addRecursive(Node current, ArrayList<String> value, Set<Integer> points, Integer level) {
        current = new Node(value, points, level);
        if (value.size() > 1 && points.size() < 16) {
            int point = minDifference(value, points);
            current.points.add(point);
            ArrayList<String> leftSet = leftSet(value, point);
            ArrayList<String> rightSet = rightSet(value, point);
            addRecursive(current.left, leftSet, current.points, current.level);
            addRecursive(current.right, rightSet, current.points, current.level);
        } else {
            if (current.level > this.highLevel) {
                this.highLevel = current.level;
            }
        }
    }

    public void buildTree() {
        int point = minDifference(this.root.value, this.root.points);
        this.root.points.add(point);
        ArrayList<String> leftSet = leftSet(this.root.value, point);
        ArrayList<String> rightSet = rightSet(this.root.value, point);
        addRecursive(this.root.left, leftSet, this.root.points, this.root.level);
        addRecursive(this.root.right, rightSet, this.root.points, this.root.level);
    }

    public int minDifference(ArrayList<String> functions, Set<Integer> points) {
        int min = functions.size();
        int point = 0;
        int k;
        int zero;
        int one;
        for (int i = 0; i < 16; i++) {
            if (!points.contains(i)) {
                k = zero = one = 0;
                for (int j = 0; j < functions.size(); j++) {
                    if (getI(functions.get(j), i) == 1) {
                        one++;
                    } else {
                        zero++;
                    }
                }
                k = Math.abs(zero - one);
                if (k < min) {
                    min = k;
                    point = i;
                }
            }
        }
        return point;
    }

    private int getI(String function, int j) {
        int k = 1;
        for (int i = 0; i < 16; i++) {
            if (i == j) {
                return Integer.parseInt(String.valueOf(function.charAt(k)));
            }
            k += 3;
        }
        return 0;
    }

    private ArrayList<String> leftSet(ArrayList<String> functions, int point) {
        ArrayList<String> leftSet = new ArrayList<String>();
        for (int i = 0; i < functions.size(); i++) {
            if (getI(functions.get(i), point) == 0) {
                leftSet.add(functions.get(i));
            }
        }
        return leftSet;
    }

    private ArrayList<String> rightSet(ArrayList<String> functions, int point) {
        ArrayList<String> rightSet = new ArrayList<String>();
        for (int i = 0; i < functions.size(); i++) {
            if (getI(functions.get(i), point) == 1) {
                rightSet.add(functions.get(i));
            }
        }
        return rightSet;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);
            if (left > right) {
                return 1 + left;
            } else {
                return 1 + right;
            }
        }
    }
}

class Node {
    ArrayList<String> value;
    Set<Integer> points;
    Integer level;
    Node left;
    Node right;

    Node(ArrayList<String> value, Set<Integer> points, Integer level) {
        this.value = new ArrayList<String>(value);
        this.points = new HashSet<Integer>(points);
        this.level = level + 1;
        right = null;
        left = null;
    }

}

