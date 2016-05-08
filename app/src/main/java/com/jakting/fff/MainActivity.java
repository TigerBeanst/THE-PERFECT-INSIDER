package com.jakting.fff;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.content.DialogInterface;


public class MainActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        clickUninstall();
        saveCustom();
        reCustom();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about_menu:
                openAboutFFF();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void openAboutFFF(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("测试关于");
        builder.setMessage("呵呵");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener(){

                @Override
                public void onClick(DialogInterface p1, int p2)
                {
                    Toast.makeText(this,"FFFFFF！",Toast.LENGTH_LONG).show();
                }
            });
    }
    public void saveCustom(){
        findViewById(R.id.saveText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText customText = (EditText)findViewById(R.id.customText);
                String fffText = customText.getText().toString();
                if (fffText.isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.emptyText), Toast.LENGTH_SHORT).show();
                    return;
                } 
                    SharedPreferences.Editor editor = getSharedPreferences("pref", MODE_WORLD_READABLE).edit();
                    editor.putString("fffcustomText", fffText);
                    editor.commit();
                    Toast.makeText(MainActivity.this,getString(R.string.saveText1)+fffText+getString(R.string.saveText2),Toast.LENGTH_LONG).show();
                
            }
        });
    }
    
    public void reCustom(){
        findViewById(R.id.reText).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fffText = "FFF"; 
                    SharedPreferences.Editor editor = getSharedPreferences("pref", MODE_WORLD_READABLE).edit();
                    editor.putString("fffcustomText", fffText);
                    editor.commit();
                    Toast.makeText(MainActivity.this,getString(R.string.saveText1)+fffText+getString(R.string.saveText2),Toast.LENGTH_LONG).show();

                }
            });


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
}
