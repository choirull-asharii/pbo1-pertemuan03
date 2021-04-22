package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);  //betulkan i nilai 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 menjadi 2
        System.out.println(i);  //tuh betulkan nilai i nya menjadi 2
        i=i+1;                  //bisa dilihat i++ sama dengan i = i+i
        System.out.println(i);  //i tadi 2 sekarang bertambah menjadi 3

        //Berlaku juga untuk penambahan aritmatika lain dan operator aritmatika lain
        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);
    }
}
