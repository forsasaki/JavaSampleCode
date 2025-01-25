class Sample11_6
{
    public static void main(String[] args)
    {
        Car[] cars;
        cars = new Car[2];

        //配列要素からオブジェクトを作成する。
        cars[0] = new Car();
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar();
        cars[1].setCar(2345, 30.5);

        for(int i=0; i<cars.length; i++)
        {
            cars[i].show();
        }
    }
}

//クラス型による制約を理解する。