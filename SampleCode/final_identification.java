//オーバーロードとオーバーライドの違い
//Over Load:Call a method that has different number of property form other method that have same name.
//Over Ride:To difine a completely same method in super class, in subclass.
//super.show();を用いると、サブクラスでスーパークラスのshow();メソッドを呼び出せる。

//finalを付けることで、オーバーライドを防ぐことができる。
//final修飾子は、メソッド、クラス、フィールドに適用できる。
/*
class car{
        ・・・
    public final void show(){
        ・・・
    }
}

class RacingCar extends Car{
    ・・・
    public void show(){
        ・・・
    }
}
show()メソッドのオーバーライドができない。
*/

/*
final class Car{
    ・・・
}
class RacingCar extends Car{
    ・・・
    public void show(){
        ・・・
    }
}

サブクラスを作成できない。
*/
