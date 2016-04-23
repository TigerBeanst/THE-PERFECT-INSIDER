package com.jakting.fff;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.jakting.fff.MainActivity;

public class MainActivity extends Activity 
{
    @Override
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
                    Uri packageUri = Uri.parse("package:"+MainActivity.this.getPackageName());
                    Intent intent = new Intent(Intent.ACTION_DELETE,packageUri);
                    startActivity(intent);
                }
            });
    }


}
