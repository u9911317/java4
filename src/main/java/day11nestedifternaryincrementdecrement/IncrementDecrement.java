package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        //increase artirmak  decrease azaltmak
        //increment
        int a =5;
        System.out.println(a);

        a= a + 2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        //ornek 1 : bir tane  integer variablae olusturun iki sekilde 5 artirin

        int b=6;
        System.out.println(b);
        b= b + 5;
        System.out.println(b);
        b +=5;//                BUNUN KULLANIMI DAHA TERCIH EDILIR
        System.out.println(b);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c-3;
        System.out.println(c);

         c -=3;
        System.out.println(c);

        //Increment 2
        int d= 6;
        System.out.println(d);
        d=d*2;
        System.out.println(d);

        d*=2;
        System.out.println(d);

        //Decrement 2
        int e = 24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        // "1" ile increment
        int f =12;
       // f=f+1;
        //f+=1;
        f++;

        // "1" ile decrement
        int h= 10;
       // h=h-1;
        //h-=1;
        h--;

        //post-increment ve pre-increment
        System.out.println("=================================");
        int i =10;
        int k =i++;
        System.out.println(k);// 10 ==> i artirilmadan k ya konuldugu icin k nin degeri 10 olur
        System.out.println(i);// 11==> i satir sonunda artirildigi icn i in degeri k ya konur 11 olur degeri

        int m =15;
        int n =++m;
        System.out.println(m);// 16==> m satir sonunda artirildigi icin m nin degeri 16 olur
        System.out.println(n);//16 ==> m artirildiktan sonra n sepetine konuldugu icin n nin degeri 16 olur

        int p =17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);
        System.out.println(t);

         /*
        1)Increment artirmak demektir, decrement azaltmak demektir.
        2) Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
                a)i=i+5;
                b)i+=5;
                c)eger 1 ile artirma ==> i++
                note:bu c sikki sadece 1 artirmak icin kullanilir

                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir

         */







    }
}
