package lld1.Generics.tripletExample;

public class Triplet <TYPE>{
    private TYPE left;
    private TYPE middle;
    private TYPE right;
    public Triplet(TYPE left, TYPE middle, TYPE right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }
    public TYPE getLeft(){
        return left;
    }
    public TYPE getMiddle(){
        return middle;
    }
    public TYPE getRight(){
        return right;
    }
}
