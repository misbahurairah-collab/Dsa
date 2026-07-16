public class fibonacci{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int fibo =3;fibo<18;fibo++){
            int newfibo =a+b;
            System.out.println(newfibo);
            a = b;
            b = newfibo;
        }
    }
}