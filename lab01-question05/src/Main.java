//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int ex1p1=cal.multiply(3,4);
        int ex1p2=cal.multiply(5,7);
        int ex1sum=cal.add(ex1p1,ex1p2);
        int result1=cal.square(ex1sum);

        int ex2p1=cal.add(4,7);
        int ex2p1sq=cal.square(ex2p1);
        int ex2p2=cal.add(8,3);
        int ex2p2sq=cal.square(ex2p2);
        int result2=cal.add(ex2p1sq,ex2p2sq);

        System.out.println("Result of Example 1:"+result1);
        System.out.println("Result of Example 2:"+result2);
    }
}