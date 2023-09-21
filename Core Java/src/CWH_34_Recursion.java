public class CWH_34_Recursion {
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

    static int fact_iterative(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=n;i++){
                product *=  i;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        int a = 1;
        System.out.println(fact(a));
        System.out.println(fact_iterative(a));
    }
}
