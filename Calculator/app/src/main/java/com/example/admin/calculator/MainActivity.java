package com.example.admin.calculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView value;
    private double status=0,dpt=0, count=0;
    public void clean(){
        value = (TextView) findViewById(R.id.value);
        value.setText("");
    }
    public void btn1(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"1");
        count++;
    }
    public void btn2(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"2");
        count++;
    }
    public void btn3(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"3");
        count++;
    }
    public void btn4(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"4");
        count++;
    }
    public void btn5(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"5");
        count++;
    }
    public void btn6(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"6");
        count++;
    }
    public void btn7(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"7");
        count++;
    }
    public void btn8(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"8");
        count++;
    }
    public void btn9(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"9");
        count++;
    }
    public void btn0(View v){
        value  = (TextView) findViewById(R.id.value);
        if(count==0)
            clean();
        value.setText(value.getText()+"0");
        count++;
    }

    public void btn_Tong(View v){
        value = (TextView) findViewById(R.id.value);
        result = (TextView) findViewById(R.id.result);
        double number = Double.parseDouble(value.getText().toString());
        double number2 = Double.parseDouble(result.getText().toString());
        if(status ==1)
            result.setText((number+number2)+"");
        if (status ==2)
            result.setText((number2-number)+"");
        if(status ==3)
            result.setText((number*number2)+"");
        if(status ==4)
            result.setText((number2/number)+"");
        if (status ==0)
            result.setText(number+"");
        value.setText("0");
        status = 1;
        count =0;
        dpt=0;
    }

    public void btn_Hieu(View v){
        result = (TextView) findViewById(R.id.result);
        value = (TextView) findViewById(R.id.value);
        double number = Double.parseDouble(value.getText().toString());
        double number2 = Double.parseDouble(result.getText().toString());
        if(status ==1)
            result.setText((number+number2)+"");
        if (status ==2)
            result.setText((number2-number)+"");
        if(status ==3)
            result.setText((number*number2)+"");
        if(status ==4)
            result.setText((number2/number)+"");
        if (status ==0)
            result.setText(number+"");
        value.setText("0");
        status = 2;
        count=0;
        dpt=0;
    }
    public void btn_Tich(View v){
        result = (TextView) findViewById(R.id.result);
        value = (TextView) findViewById(R.id.value);
        double number = Double.parseDouble(value.getText().toString());
        double number2 = Double.parseDouble(result.getText().toString());
        if(status ==1)
            result.setText((number+number2)+"");
        if (status ==2)
            result.setText((number2-number)+"");
        if(status ==3)
            result.setText((number*number2)+"");
        if(status ==4)
            result.setText((number2/number)+"");
        if (status ==0)
            result.setText(number+"");
        value.setText("0");
        status = 3;
        count=0;
    }
    public void btn_Thuong(View v){
        result = (TextView) findViewById(R.id.result);
        value = (TextView) findViewById(R.id.value);
        double number = Double.parseDouble(value.getText().toString());
        double number2 = Double.parseDouble(result.getText().toString());
        if(status ==1)
            result.setText((number+number2)+"");
        if (status ==2)
            result.setText((number2-number)+"");
        if(status ==3)
            result.setText((number*number2)+"");
        if(status ==4)
            result.setText((number2/number)+"");
        if (status ==0)
            result.setText(number+"");
        value.setText("0");
        status = 4;
        count=0;
    }
    public void btn_Clear(View v){
        result = (TextView) findViewById(R.id.result);
        value = (TextView) findViewById(R.id.value);
        value.setText("0");
        result.setText("0");
        count=0;
        dpt=0;
        status =0;

    }
    public void btn_Result(View v){
        result = (TextView) findViewById(R.id.result);
        value = (TextView) findViewById(R.id.value);
        double number = Double.parseDouble(value.getText().toString());
        double number2 = Double.parseDouble(result.getText().toString());
        if(status ==1)
            result.setText((number+number2)+"");
        if (status ==2)
            result.setText((number2-number)+"");
        if(status ==3)
            result.setText((number*number2)+"");
        if(status ==4)
            result.setText((number2/number)+"");
        count=0;
    }
    public void btn_Bck(View v){
        result = (TextView) findViewById(R.id.result);
        String a = result.getText().toString();
        if(a.equals("0")==false){
            result.setText(a.substring(0, a.length()-1));
        }
    }
    public void btn_Dot(View v){
        value = (TextView) findViewById(R.id.value);
        if(dpt==0) {
            value.setText(value.getText() + ".");
            dpt++;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

