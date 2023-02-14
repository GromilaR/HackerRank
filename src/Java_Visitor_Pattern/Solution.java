package Java_Visitor_Pattern;

import java.util.Scanner;

public class Solution {
    private static Tree tree;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nodeNumbers = scanner.nextInt();
        int[] nodeValues = new int[nodeNumbers];
        int[] nodeColour = new int[nodeNumbers];
        for (int i = 0; i < nodeNumbers; i++) nodeValues[i] = scanner.nextInt();
        for (int i = 0; i < nodeNumbers; i++) nodeColour[i] = scanner.nextInt();
        tree = new Tree(nodeValues[0], nodeColour[0], 0);
        for (int i = 0; i < nodeNumbers - 1; i++) {
            int seq1 = scanner.nextInt();
            int seq2 = scanner.nextInt();
            tree.CreateNode(tree, nodeValues, nodeColour, seq1, seq2, 0);
        }
        System.out.println();

        SumInLeavesVisitor sumInLeavesVisitor = new SumInLeavesVisitor(tree);
        ProductOfRedNodesVisitor productOfRedNodesVisitor = new ProductOfRedNodesVisitor(tree);
        FancyVisitor fancyVisitor = new FancyVisitor(tree);

        int res1 = sumInLeavesVisitor.getResult();
        int res2 = productOfRedNodesVisitor.getResult();
        int res3 = fancyVisitor.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

