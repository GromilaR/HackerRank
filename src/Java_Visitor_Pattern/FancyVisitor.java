package Java_Visitor_Pattern;

import java.util.ArrayList;

public class FancyVisitor implements Visitor {
    int sumLeaf;
    int sumNode;
    TreeLeaf leaf;
    TreeNode node;

    public FancyVisitor(Tree tree) {
        this.leaf = new TreeLeaf(tree);
        this.node = new TreeNode(tree);
    }

    @Override
    public int getResult() {
        visitLeaf(leaf);
        visitNode(node);
        return Math.abs(sumNode - sumLeaf);
    }

    @Override
    public void visitNode(TreeNode node) {
        for (ArrayList temp : node.getNode().values()) {
            if ((Integer) temp.get(2) % 2 == 0) sumNode = sumNode + (Integer) temp.get(0);
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        for (ArrayList temp : leaf.getLeaf().values()) {
            if ((Integer) temp.get(1) == 1) sumLeaf = sumLeaf + (Integer) temp.get(0);
        }
    }
}
