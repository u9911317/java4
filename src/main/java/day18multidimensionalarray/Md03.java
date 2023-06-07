package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Ornek : iki boyutlu bir arrayi tek boyutlu bir array a ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}}; //==>{5,4,2,3,2}

        //1. step: iki boyutlu arrayde kac tane eleman oldugunu bulan kodu yazin
        int toplamElemanSaayisi=0;
        for (int[] w: numbers){
        toplamElemanSaayisi=  toplamElemanSaayisi+  w.length;
        }
        System.out.println(toplamElemanSaayisi);



        //2: step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmalyiz
        int newArray[]= new  int[toplamElemanSaayisi];


        //3.step: iki boyutlu arraydeki elemanlari tek boyutlu array e transfer etmelyiz

        int idx=0;
        for (int[]  w: numbers){// outer loop ile multidemensional arrayin int array olan elemanlarini tek tek aliriz

            for (int k : w){//
                newArray[idx]=k;//yeni olusturmus oldugumuz arraye index kullanarak atama yapiyoruz
                idx++;//bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArray));





    }
}
