package Java_Visitor_Pattern;

public class Tree {
    private Tree leftNode;
    private Tree rigthNode;
    private int nodeValue;
    private int nodeColour;
    private int depth;

    Tree (int nodeValue, int nodeColour, int depth){
        this.nodeValue = nodeValue;
        this.nodeColour = nodeColour;
        this.leftNode = null;
        this.rigthNode = null;
        this.depth = depth;
    }

    public Tree() {
    }

    public void CreateNode (Tree tree, int[] nodeValues, int[] nodeColour, int nodeData1, int nodeDate2, int depth){
        Tree findNode = FindNode(tree,nodeValues[nodeData1-1]);

        if (findNode.nodeValue == nodeValues[nodeData1-1] && findNode.leftNode == null) findNode.leftNode = new Tree(nodeValues[nodeDate2-1],nodeColour[nodeDate2-1],depth+1);
        else if (findNode.nodeValue == nodeValues[nodeData1-1] && findNode.rigthNode == null) findNode.rigthNode = new Tree(nodeValues[nodeDate2-1],nodeColour[nodeDate2-1],depth+1);
    }

    private Tree FindNode (Tree find,int nodeValue){
        Tree temp;
        if (find.nodeValue==nodeValue) return find;
        else {
            if (find.leftNode!=null) temp = FindNode(find.leftNode,nodeValue); else return null;
            if (temp == null && find.rigthNode!=null) temp = FindNode(find.rigthNode,nodeValue); else return null;}
        return temp;
    }

    public int getValue() {
        return nodeValue;
    }

    public int getColour() {
        return nodeColour;
    }

    public int getDepth() {
        return depth;
    }

    public Tree getLeftNode() {
        return leftNode;
    }

    public Tree getRigthNode() {
        return rigthNode;
    }
}
