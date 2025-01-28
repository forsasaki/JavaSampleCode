//マウスに反応させる
import java.awt.*;
import java.awt.event.*;

public class Sample16_4 extends Frame
{
    private Button bt;

    public static void main(String[] args)
    {
        Sample16_4 sm = new Sample16_4();
    }
    public Sample16_4()     //Sample16_4のコンストラクタ
    {
        super("サンプル");

        bt = new Button("ようこそ");    //ボタンの作成
        add(bt);        //ボタンの追加

        addWindowListener(new SampleWindowListener());      //ウィンドウイベントを受け取るオブジェクト
        bt.addMouseListener(new SampleMouseListener());     //マウスイベントを受け取るオブジェクト

        setSize(250, 200);
        setVisible(true);
    }

    class SampleWindowListener extends WindowAdapter    //WindowAdapterクラスを拡張してSampleWindowListenerクラスを作成する
    {
        public void windowClosing(WindowEvent e)        //WindowEventクラスの変数eを引数に持つ、sindowClosing()メソッド
        {
            System.exit(0);
        }
    }

    class SampleMouseListener implements MouseListener      //MouseListenerインターフェースを実装したSampleMouseListenerクラスを作成
    {
        public void mouseClicked(MouseEvent e)
        {
            bt.setLabel("押したな？この画面を。");
        }        //MouseEventのオブジェクトeを引数に持つmouseClicked()メソッドをオーバーライド(MouseListenerクラスの抽象メソッドを再定義している)。
        public void mousePressed(MouseEvent e)
        {
            bt.setLabel("長いなー");
        }
        public void mouseReleased(MouseEvent e)
        {
            bt.setLabel("Never Release me. ――Kazuo Ishigro.");
        }
        public void mouseEntered(MouseEvent e)
        {
            bt.setLabel("いらっしゃいませ.");   //マウスが（ボタン範囲内に）入った時に行われる処理。
        }
        public void mouseExited(MouseEvent e)
        {
            bt.setLabel("ようこそ.");   //マウスが（ボタン範囲外に）出た時に行われる処理。
        }
    }
}