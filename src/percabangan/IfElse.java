package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 25000;
        double uangDiDompet = 20000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else{
            System.out.println("Uang pas... Selamat Menikmati..");
        }
    }
}
