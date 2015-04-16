package com.zms.onoff;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.zms.onoff.library.CheckBox;
import com.zms.onoff.library.Switch;

public class MainActivity extends Activity {
    private CheckBox mCheckBox;
    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckBox = (CheckBox) findViewById(R.id.mCheckBox);
        mCheckBox.setChecked(true);
        mCheckBox.setOnCheckListener(new MyCheckBoxOnCheckListener());

        mSwitch = (Switch) findViewById(R.id.mSwitch);
        mSwitch.setChecked(true);
        mSwitch.setOnCheckListener(new MySwitchOnCheckListener());
    }

    class MyCheckBoxOnCheckListener implements CheckBox.OnCheckListener {

        @Override
        public void onCheck(boolean check) {
            Toast.makeText(getApplicationContext(), "isCheck:" + check, Toast.LENGTH_SHORT).show();
        }
    }

    class MySwitchOnCheckListener implements Switch.OnCheckListener {

        @Override
        public void onCheck(boolean check) {
            Toast.makeText(getApplicationContext(), "isCheck:" + check, Toast.LENGTH_SHORT).show();
        }
    }

}
