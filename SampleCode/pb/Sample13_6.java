//名前空間について。
//パッケージによって区別されるクラス名の集まりは、名前空間(name space)

//インポートについて。
/*
pc.Car car1 = new pc.Car();

このような記述を、

import pc.Car();
・・・
Car car1 = new Car();

このように省略できる。

一度インポートしておけば、それ以下ではパッケージを宣言する必要が無い.
*/

package pb;
import pc.Car;  //pc内のCarクラスをインポート

class Sample13_6
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
    }
}