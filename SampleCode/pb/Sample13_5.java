package pb;

class Sample13_5
{
    public static void main(String[] args)
    {
        pc.Car car1 = new pc.Car();     //パッケージpcのCarクラスの識別子。
        car1.show();
    }
}

//異なるパッケージのクラスを利用するためには、利用する外部パッケージのクラスをpublicにし、
//そのクラスを呼び出すときにはpc.Carのようにパッケージの識別子を付ける必要がある。