/*
Dhruv Sharma
9/30/2020
9/30/2020
This is a simple node class
*/

public class TestNode<T>
{
    private TestNode joeMama;
    private TestNode notJoeMama
    private T tData;

    public TestNode()
    {
        //empty
    }

    public TestNode(T data<T>)
    {
        t = data<T>;
        joeMama = null;
        notJoeMama = null;
    }

    public TestNode(T data<T>, TestNode parent, TestNode child)
    {
        t = data;
        joeMama = parent;
        notJoeMama = child;
    }

    public TestNode getParent ()
    {
        return joeMama;
    }

    public TestNode getChild ()
    {
        return notJoeMama;
    }

    public T getT()
    {
        return t;
    }

    public void newParent(TestNode parent)
    {
        joeMama =  parent;
    }

    public void newParent(TestNode child)
    {
        notJoeMama =  child;
    }

    public void newParent(T data)
    {
        tData =  data;
    }

    public String toString()
    {
        return "Node: " + t.toString();
    }

    public boolean equals(TestNode nodeToCompare)
    {
        return TestNode.equals(nodeToCompare);
    }

}