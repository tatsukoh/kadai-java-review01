package sample;

public class ArithmeticOperations {

    public static void main(String[] args) {
        // 変数の宣言・初期化
        int num1=2000;//int型変数num1を宣言し、２０００を代入
        int num2=10;//int型変数num2を宣言し、１０を代入

        //int型変数result1を宣言し、num1とnum2の加算結果を代入
        int result1=num1+num2;
        //加算結果を出力
        System.out.println("num1+num2="+result1);

        //int型変数result2を宣言し、num1とnum2の減産結果を代入
        int result2=num1-num2;
        //減産結果を出力
        System.out.println("num1-num2="+result2);

        //int型変数resule3を宣言し、num1とnum2の乗算結果を代入
        int result3=num1*num2;
        //乗算結果を出力
        System.out.println("num1*num2="+result3);

        //int型変数result4を宣言し、num1とnum2の除算結果を代入
        int result4=num1/num2;
        //除算結果を出力
        System.out.println("num1/num2="+result4);

        //int型変数result5を宣言し、num1とnum2の剰余算結果を代入
        int result5=num1%num2;
        //剰余算結果を出力
        System.out.println("num1%num2="+result5);



    }

}
