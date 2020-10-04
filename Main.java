/*
Dhruv Sharma
10/1/2020
10/4/2020
This is a driver for TestNode
*/

public class Main {

    public static void main(String[] args) {
        TestNode parent = new TestNode(3); //regular parent node to be used by regular nodes
        TestNode child = new TestNode(3); //regular child nodes to be used by regular nodes

        TestNode testParent = new TestNode(5); //parent node for use with regularAllParam
        TestNode testChild = new TestNode(5); //child node for use with regularAllParam



        TestNode regularEmpty = new TestNode(); //no param filled in
        TestNode regularData = new TestNode(4); //data param filled in
        TestNode regularAllParam = new TestNode(4, parent, child); //data, child, and parent param filled in


        System.out.println("//regularEmpty Tests");

        //null
        System.out.println(regularEmpty.getParent());
        System.out.println(regularEmpty.getChild());
        System.out.println(regularEmpty.getTData());

        //changing parent, child, and data
        regularEmpty.newParent(parent);
        regularEmpty.newChild(child);
        regularEmpty.newTData(4);

        //printing changed values
        System.out.println(regularEmpty.getParent());
        System.out.println(regularEmpty.getChild());
        System.out.println(regularEmpty.getTData());

        //testing toString
        System.out.println(regularEmpty.toString());

        //comparing with regularAllParam
        System.out.println(regularEmpty.equals(regularAllParam)); //true



        System.out.println("//regularData Tests");

        //original params
        System.out.println(regularData.getParent());
        System.out.println(regularData.getChild());
        System.out.println(regularData.getTData());

        //changing parent, child, and data
        regularData.newParent(parent);
        regularData.newChild(child);
        regularData.newTData(5);

        //printing changed values
        System.out.println(regularData.getParent());
        System.out.println(regularData.getChild());
        System.out.println(regularData.getTData());

        //testing toString
        System.out.println(regularData.toString());

        //comparing with regularAllParam
        System.out.println(regularData.equals(regularAllParam)); //false



        System.out.println("//regularAllParam Tests");

        //original params
        System.out.println(regularAllParam.getParent());
        System.out.println(regularAllParam.getChild());
        System.out.println(regularAllParam.getTData());

        //changing parent, child, and data (changing parent and node to testParent and testChild respectively)
        regularAllParam.newParent(testParent);
        regularAllParam.newChild(testChild);
        regularAllParam.newTData(5);

        //printing changed values
        System.out.println(regularAllParam.getParent());
        System.out.println(regularAllParam.getChild());
        System.out.println(regularAllParam.getTData());

        //testing toString
        System.out.println(regularAllParam.toString());

        //comparing with regularEmpty
        System.out.println(regularAllParam.equals(regularEmpty)); //false












    }
}