//車クラス
class Car
{
    int num;
    double gas;

    int getNum()
    {
        System.out.println("ナンバーを調べました。");
        return num;                                      //呼び出し元（get Num()）に値を返す。
    }
    double getGas()
    {
        System.out.println("ガソリン量を調べました。");
        return gas;                                      //呼び出し元（get Gas()）に値を返す。
    }
    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("車のナンバーを" + num + "ガソリン量を" + gas + "にしました。");
    }
    void show()
    {
        System.out.println("車のナンバー: " + num);
        System.out.println("ガソリン量: " + gas);
    }
}

class Sample8_6
{
    public static void main(String[] args) 
    {
    Car car1 = new Car();
    
    car1.setNumGas(1234, 20.5);

    int number = car1.getNum(); //戻り値を利用。関数名を代入する値として指定するには、戻り値を指定しなければならない。
    double gasoline = car1.getGas();

    System.out.println("サンプルから車を調べたところ");
    System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");
 }
}

//メソッドを使用して得られる値をそのまま代入する時は、メソッドに戻り値を指定する必要がある。