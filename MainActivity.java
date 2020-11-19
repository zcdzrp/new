package com.example.jisuan;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;  //引用按钮组件
import android.widget.EditText;  //引用文本编辑框组件
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    Button Button0,Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,
            ButtonAc,ButtonSf,ButtonP,ButtonDiv,ButtonT,ButtonE,ButtonX,ButtonM,ButtonPe;
    TextView TextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        jiSuan();
    }
    private void jiSuan(){
     Button0=(Button)findViewById(R.id.Button0);
        Button0.setOnClickListener(listener);

        ButtonAc=(Button)findViewById(R.id.ButtonAc);
        ButtonAc.setOnClickListener(listener);

        Button1=(Button)findViewById(R.id.Button1);
        Button1.setOnClickListener(listener);

        Button2=(Button)findViewById(R.id.Button2);
        Button2.setOnClickListener(listener);

        Button3=(Button)findViewById(R.id.Button3);
        Button3.setOnClickListener(listener);

        Button4=(Button)findViewById(R.id.Button4);
        Button4.setOnClickListener(listener);

        Button5=(Button)findViewById(R.id.Button5);
        Button5.setOnClickListener(listener);

        Button6=(Button)findViewById(R.id.Button6);
        Button6.setOnClickListener(listener);

        Button7=(Button)findViewById(R.id.Button7);
        Button7.setOnClickListener(listener);

        Button8=(Button)findViewById(R.id.Button8);
        Button8.setOnClickListener(listener);

        Button9=(Button)findViewById(R.id.Button9);
        Button9.setOnClickListener(listener);

        ButtonP=(Button)findViewById(R.id.ButtonP);
        ButtonP.setOnClickListener(listener);

        ButtonM=(Button)findViewById(R.id.ButtonM);
        ButtonM.setOnClickListener(listener);

        ButtonX=(Button)findViewById(R.id.ButtonX);
        ButtonX.setOnClickListener(listener);

        ButtonDiv=(Button)findViewById(R.id.ButtonDiv);
        ButtonDiv.setOnClickListener(listener);

        ButtonE=(Button)findViewById(R.id.ButtonE);
        ButtonE.setOnClickListener(listener);

        ButtonT=(Button)findViewById(R.id.ButtonT);
        ButtonT.setOnClickListener(listener);

        ButtonPe=(Button)findViewById(R.id.ButtonPe);
        ButtonPe.setOnClickListener(listener);

        ButtonSf=(Button)findViewById(R.id.ButtonSf);
        ButtonSf.setOnClickListener(listener);

        TextView1=(TextView) findViewById(R.id.textView1);
        
    }

    private int x = 0;
    double newNumber = 0;
    double plus = 0;
    double currentNumber = 0;
    String currentText = "";
    int hajimei = 0;



    private OnClickListener listener = new OnClickListener() {
        public void onClick(View v) {
            String result="";
            if (hajimei != 0) {
                TextView1.setText("");
                hajimei=0;
                newNumber=0;
            }
            if (TextView1.getText().toString().equals("0")) {  //若当前输入数为0则设置文本编辑框为””
                TextView1.setText("");

            }

            String number = "";
            switch (v.getId()) {
                case R.id.Button0:
                    TextView1.setText(TextView1.getText() + "0");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;

                case R.id.Button1:

                    TextView1.setText(TextView1.getText() + "1");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button2:
                    TextView1.setText(TextView1.getText() + "2");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button3:
                    TextView1.setText(TextView1.getText() + "3");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button4:
                    TextView1.setText(TextView1.getText() + "4");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button5:
                    TextView1.setText(TextView1.getText() + "5");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button6:
                    TextView1.setText(TextView1.getText() + "6");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button7:
                    TextView1.setText(TextView1.getText() + "7");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button8:
                    TextView1.setText(TextView1.getText() + "8");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case R.id.Button9:
                    TextView1.setText(TextView1.getText() + "9");
                    newNumber=Double.parseDouble(TextView1.getText().toString());
                    break;
                case  R.id.ButtonAc:
                    TextView1.setText("0");
                    x=0;
                    hajimei=0;
                    newNumber=0;
                    currentNumber=0;

                    break;

                case  R.id.ButtonPe:
                    double xx=0;
                    xx=Double.parseDouble((String) TextView1.getText());
                    result=new BigDecimal(String.valueOf(xx/100)).stripTrailingZeros().toPlainString();
                    TextView1.setText(result);
                    newNumber=xx/100;
                    break;

                case R.id.ButtonSf:
                     if(TextView1.getText().toString().startsWith("-")){
                         result=new BigDecimal(TextView1.getText().toString()).stripTrailingZeros().toPlainString();
                    TextView1.setText(result.replace("-",""));
                     }
                     else{
                        double Sf=-Double.parseDouble(TextView1.getText().toString());
                         result=new BigDecimal(String.valueOf(Sf)).stripTrailingZeros().toPlainString();
                         TextView1.setText(result);
                     };
                    break;

                case  R.id.ButtonT:
                    if(TextView1.getText().toString()==""){
                        TextView1.setText(TextView1.getText() + "0.");
                    }
                    else {
                        TextView1.setText(TextView1.getText() + ".");
                        newNumber = Double.parseDouble(TextView1.getText().toString());
                    }
                    break;
                case  R.id.ButtonP:
                    if (x == 1) {
                        plus = currentNumber + newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    else if(x==2){
                        plus = currentNumber - newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==3){
                        plus = currentNumber * newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==4){
                        plus = currentNumber / newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    else {
                        currentText = TextView1.getText().toString();
                        currentNumber = Double.parseDouble(currentText);
                        x=1;
                        hajimei=1;
                        break;
                    }
                    currentText = TextView1.getText().toString();
                    currentNumber = Double.parseDouble(currentText);
                    x=1;
                    hajimei=1;
                    break;


                case  R.id.ButtonM:
                    if (x == 1) {
                        plus = currentNumber + newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==2){
                        plus = currentNumber - newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==3){
                        plus = currentNumber * newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==4){
                        plus = currentNumber / newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    else {
                        currentText = TextView1.getText().toString();
                        currentNumber = Double.parseDouble(currentText);
                        x=2;
                        hajimei=1;
                        break;
                    }
                    currentText = TextView1.getText().toString();
                    currentNumber = Double.parseDouble(currentText);
                    x=2;
                    hajimei=1;

                    break;


                case  R.id.ButtonX:
                    if (x == 1) {
                        plus = currentNumber + newNumber;
                       result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==2){
                        plus = currentNumber - newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==3){
                        plus = currentNumber * newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==4){
                        plus = currentNumber / newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    else {
                        currentText = TextView1.getText().toString();
                        currentNumber = Double.parseDouble(currentText);
                        x=3;
                        hajimei=1;
                        break;
                    }
                    currentText = TextView1.getText().toString();
                    currentNumber = Double.parseDouble(currentText);
                    x=3;
                    hajimei=1;

                    break;

                case  R.id.ButtonDiv:
                    if (x == 1) {
                        plus = currentNumber + newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==2){
                        plus = currentNumber - newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==3){
                        plus = currentNumber * newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==4){
                        plus = currentNumber / newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    else {
                        currentText = TextView1.getText().toString();
                        currentNumber = Double.parseDouble(currentText);
                        x=4;
                        hajimei=1;
                        break;
                    }
                    currentText = TextView1.getText().toString();
                    currentNumber = Double.parseDouble(currentText);
                    x=4;
                    hajimei=1;

                    break;


                case R.id.ButtonE:
                    if (x == 1) {
                        plus = currentNumber + newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==2){
                        plus = currentNumber - newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==3){
                        plus = currentNumber * newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();

                    }
                    else if(x==4){
                        plus = currentNumber / newNumber;
                        result=new BigDecimal(String.valueOf(plus)).stripTrailingZeros().toPlainString();
                        TextView1.setText(result);
                        currentText = TextView1.getText().toString();
                    }
                    x=0;

            }
        }
    };
}