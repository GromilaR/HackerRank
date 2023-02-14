package Java_Visitor_Pattern;

import java.util.ArrayList;

public class SumInLeavesVisitor implements Visitor {
    int sumLeaf;
    TreeLeaf leaf;
    @Override
    public int getResult() {
        visitLeaf(leaf);
        return sumLeaf;
    }

    public SumInLeavesVisitor(Tree tree) {
        this.leaf = new TreeLeaf(tree);

    }

    @Override
    public void visitNode(TreeNode node) {

    }
    @Override
    public void visitLeaf(TreeLeaf leaf) {

       for (ArrayList temp :leaf.getLeaf().values()){
           sumLeaf = sumLeaf + (Integer)temp.get(0);
       }
    }
}
