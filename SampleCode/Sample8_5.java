//Carクラス
class Car
{
    int num;
    double gas;

    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample8_5
{
    public static void main(String[] args) 
    {
        {
            Car car1 = new Car();

            int number = 1234;
            double gasoline = 20.5;

            car1.setNumGas(number, gasoline);
        }
    }
}

//set時はフィールドへの代入（オブジェクト内部に値が保存される）のでsetメソッドはvoid、get時はsetした値を返して出力（System.out.print(setした値)という使い方をする。
//普段はsetでオブジェクトのステートを変更することが多いので、voidをみることが多い。