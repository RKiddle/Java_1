/*
@author: Richard Kiddle 18/11/20
@description:
Takes two command line inputs: name1 and name2
Returns Hello + name1 + name2; Goodbye + name2 + name1

 */

public class HelloGoodbye {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");


    }
}
