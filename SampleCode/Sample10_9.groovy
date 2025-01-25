//オブジェクトの配列
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("You made a car.");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("You set the number of car" + num + "and the quantity of gasoline" + gas);
    }
}

class Sample10_9
{
    public static void main(String[] args)
    {
        //クラス型の三要素の配列を定義⇒要素分のオブジェクトを作成して配列に代入
        Car[] = cars;
        cars = new Car[3];      //配列オブジェクトと言えそうなもの。
        
        for(i=0; cars.length; i++)
        {
            cars[i] = new Car();
        }

        cars[0] = setCar(1234, 20.5);
        cars[1] = setCar(2345, 30.5);
        cars[2] = setCar(3456, 40.5);

        for(i=0; cars.length; i++)
        {
            cars[i].show();
        }
    }
}