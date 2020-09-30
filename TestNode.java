/*
Dhruv Sharma
9/30/2020
9/30/2020
This is a simple node class
*/

public class TestNode
{
    private TestNode joeMama;
    private TestNode notJoeMama
    private T t;

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
        t = data<T>;
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



}