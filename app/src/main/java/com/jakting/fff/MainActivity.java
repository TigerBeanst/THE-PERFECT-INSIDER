package com.jakting.fff;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.jakting.fff.MainActivity;
import android.widget.TextView;


public class MainActivity extends Activity
{
    @Override
   private String fff;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        clickUninstall();
    }
    public void clickUninstall(){
        findViewById(R.id.uninstall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri packageUri = Uri.parse("package:" + MainActivity.this.getPackageName());
                Intent intent = new Intent(Intent.ACTION_DELETE, packageUri);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        String tip;
        TextView text=(TextView) findViewById(R.id.text);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.changefff:
                if (checked)
                    Toast.makeText(MainActivity.this, "辣鸡F", Toast.LENGTH_SHORT).show();
                    tip="重启后您的手机将会全是F";
                    fff="FFF";
                text.setText("重启后您的手机将会全是F");
                break;
            case R.id.changesss:
                if (checked)
                    Toast.makeText(MainActivity.this, "辣鸡S", Toast.LENGTH_SHORT).show();
                    tip="重启后您的手机将会全是S";
                    fff="SSS";
                text.setText("重启后您的手机将会全是S");
                    break;
        }
    }
}
