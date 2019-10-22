package demo.news.elminya;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class UnitandCenter extends AppCompatActivity {
Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitand_center);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name=" http://fldc.minia.edu.eg/";
                startActivity(new Intent(UnitandCenter.this,web.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="  http://mc.minia.edu.eg/insurance/";
                startActivity(new Intent(UnitandCenter.this,web.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="  http://mc.minia.edu.eg/ICTP/";
                startActivity(new Intent(UnitandCenter.this,web.class));
            }
        });

    }
}
