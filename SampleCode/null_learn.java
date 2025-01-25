//null を学ぶ
class null_learn{
public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1 = null;
    }
}
//null を代入することで、car1はCarのオブジェクトではなくなる。これをGarbage Collectionという。