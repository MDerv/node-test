/*
Dhruv Sharma
9/30/2020
10/1/2020
This is a simple node class
*/

public class TestNode<T> {

    private TestNode parentNode;
    private TestNode childNode;
    private T tData;

    public TestNode() {
        //empty
    }

    public TestNode(T data) {
        tData = data;
        parentNode = null;
        childNode = null;
    }

    public TestNode(T data, TestNode parent, TestNode child) {
        tData = data;
        parentNode = parent;
        childNode = child;
    }

    public TestNode getParent () {
        return parentNode;
    }

    public TestNode getChild () {
        return childNode;
    }

    public T getTData() {
        return tData;
    }

    public void newParent(TestNode parent) {
        parentNode =  parent;
    }

    public void newChild(TestNode child) {
        childNode =  child;
    }

    public void newData(T data) {
        tData =  data;
    }

    public String toString() {
        return "Node: " + tData.toString();
    }

    public boolean equals(TestNode nodeToCompare) {
        return tData == nodeToCompare.getTData();
    }

}