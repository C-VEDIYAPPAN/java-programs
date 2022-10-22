public class Break_Continue_Statement {
    public static void main(String[] args) {
       /*
       The continue statement performs such an action. In while and do-while loops, a continue statement causes control to be transferred directly to the conditional expression that controls the loop.
        */
        for (int i = 1; i <= 10; i++) {
            if(i==5)
                continue;
            System.out.println(i);
            if(i==8)
                break;
        }
    }
}
