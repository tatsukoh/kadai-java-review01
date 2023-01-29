package sample;

public class Review01 {

    public static void main(String[] args) {

        //変数に金額を代入
        int nedan=1500;

        //税率を代入
        int zei=10;

        //変数を定義
        int result;

        //resultにtaxMethodの結果を代入
        result=taxMethod(nedan,zei);

        System.out.println(nedan+"円の税込み価格は"+(nedan+result)+"円"+("(消費税は"+result+"円)")+"です");

    }

    //消費税額の計算メソッドの定義
    public static int taxMethod(int nedan,int zei) {
        int result=(nedan*zei/100);
        return result;

    }

}
