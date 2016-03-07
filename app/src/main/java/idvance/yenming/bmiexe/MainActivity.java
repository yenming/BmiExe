package idvance.yenming.bmiexe;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //宣告類別 EditText 兩個名稱為 edit_height 與 edit_weight (輸入身高體重用)
    private EditText edit_height,edit_weight;
    //宣告類別 Button 名稱為 bt (開始計算用)
    private Button bt;
    //宣告類別 TextView 名稱為 showBMI (顯示計算結果用)
    private TextView showBMI;
    //宣告浮點數 三個 (取得資料計算之用)
    private float getheight,getweight,MyBMI;

    @Override
    //onCreate程式起始點
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //指定載入的layout
        setContentView(R.layout.activity_main);

        //定義物件
        edit_height = (EditText)findViewById(R.id.layout_edit_height);
        edit_weight = (EditText)findViewById(R.id.layout_edit_weight);

        showBMI = (TextView)findViewById(R.id.layout_show_bmi);

        bt = (Button)findViewById(R.id.layout_button);
        bt = (Button)findViewById(R.id.subBtn);
        //EditText取得的資料是String，定義String來接收它
        //取得輸入的身高
        String TmpHeight = edit_height.getText().toString();
        //取得輸入的體重
        String TmpWeight = edit_weight.getText().toString();

        //String 轉換成 浮點數
        getheight = Float.parseFloat(TmpHeight);
        getweight = Float.parseFloat(TmpWeight);

        //因輸入的身高為公分，BMI計算身高為公尺，所以要除於100
        getheight = getheight/100;
        //計算BMI值
        MyBMI = getweight / (getheight * getheight);

        //顯示計算後的BMI
        bt.setOnClickListener(new OnClickListener() {
            @Override
            //button按下時 觸發事件
            public void onClick(View v) {

                showBMI.setText("Your BMI : "+MyBMI);
                //將EditText清空
                edit_height.setText("");
                edit_weight.setText("");
            }
        });
        //顯示計算後的BMI
        bt.setOnClickListener(new OnClickListener() {
            @Override
            //button按下時 觸發事件
            public void onClick(View v) {

                showBMI.setText("Your BMI : "+MyBMI);
                //將EditText清空
                edit_height.setText("");
                edit_weight.setText("");
            }
        });


    }
}
