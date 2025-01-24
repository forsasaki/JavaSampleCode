class Car
{
    private int num;
    private double gas;

    public void setNumGas(int n, double g)
    {
        if(g > 0 && g < 1000){
            num = n;
            gas = g;
            System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
        }
        else{
            System.out.println(g + "は正しい値ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }
        public void show()
        {
            System.out.println("車のナンバーは" + num + "です。");
            System.out.println("ガソリン量は" + gas + "です。");
        }
    }

    class Sample9_2
    {
        public static void main(String[] args)
        {
            Car car1 = new Car();

            //このようなアクセスは不可
            //car1.num = 1234;
            //car1.gas = -10.5;

            car1.setNumGas(1234, 20.5); //public メソッドに適切な実引数を指定して呼び出し。
            car1.show();
        }
    }

//クラス内で定義されたメソッドは、同じクラス内のprivate変数にアクセスできる。
//これを利用して、オブジェクトからクラスのprivate変数にアクセスするには、クラス内に定義したpublicメソッドを経由する必要がある。
//public修飾子(modifier)が付いた要素をpublic メンバという。
//クラスのメンバにprivate修飾子を付けてアクセスを制限することを、カプセル化（encapusulation）という。