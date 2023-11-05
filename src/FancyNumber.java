class FancyNumber{
    public static void main(String[] args){
        new FancyNumber().isFancy(61);
    }

    void isFancy(int n){

        int a= 1; 
        int b = 1;

        while(true){
            int c = 3*b + 2*a;
            System.out.println(c);

            if(c == n){
                System.out.println("this is fancy");
                return;
            }else if( c > n){
                System.out.println("Nope not fancy");
                return;
            }
            a = b;
            b = c;
        }

    }
}