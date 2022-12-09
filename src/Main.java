public class Main {
    public static void main(String[] args) {
        /*
        [A]: 2 <= 2 && !true
        [B]: !false && 3 > 2
        [C]: considering that t=false and f=true: !(!t || f)
        [D]: 6 > 6 ^ !(true && true)
         */

        //A False
        boolean A = 2<=2 && !true;
        //B True
        boolean B = !false && 3>2;
        //C False
        boolean t=false;
        boolean f=true;
        boolean C = !(!t||f);
        //D False
        boolean D = 6>6 ^ !(true && true);

        System.out.println("A is "+A);
        System.out.println("B is "+B);
        System.out.println("C is "+C);
        System.out.println("D is "+D);

    }
}