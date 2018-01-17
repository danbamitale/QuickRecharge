package com.danbamitale.quickrecharge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.danbamitale.quickrecharge.custom_ui.CameraSourcePreview;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{

    private CameraSourcePreview cameraSourcePreview;
    private RadioGroup networkRadGroup;
    private AppCompatRadioButton _9mobileRadButton;
    private AppCompatRadioButton airtelRadButton;
    private AppCompatRadioButton gloRadButton;
    private AppCompatRadioButton mtnRadButton;
    private RadioGroup simRadGroup;
    private AppCompatRadioButton sim1RadButton;
    private AppCompatRadioButton sim2RadButton;
    private FrameLayout rechargeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraSourcePreview =  findViewById(R.id.cameraSourcePreview);
        networkRadGroup =  findViewById(R.id.networkRadGroup);
        networkRadGroup.setOnCheckedChangeListener(this);

        _9mobileRadButton =  findViewById(R.id._9mobileRadButton);
        airtelRadButton =  findViewById(R.id.airtelRadButton);
        gloRadButton =  findViewById(R.id.gloRadButton);
        mtnRadButton =  findViewById(R.id.mtnRadButton);

        simRadGroup =  findViewById(R.id.simRadGroup);
        simRadGroup.setOnCheckedChangeListener(this);

        sim1RadButton =  findViewById(R.id.sim1RadButton);
        sim2RadButton =  findViewById(R.id.sim2RadButton);

        rechargeButton = findViewById(R.id.rechargeButton);
        rechargeButton.setOnClickListener(this);

    }

    private EditText getServiceCodeText(){
        return (EditText) findViewById(R.id.serviceCodeText);
    }

    private EditText getRecharegeTokenText(){
        return (EditText) findViewById(R.id.recharegeTokenText);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        if (radioGroup.getId() == networkRadGroup.getId()){
            String code = "";
            switch(checkedId){
                case R.id._9mobileRadButton: code = "222";
                    break;
                case R.id.airtelRadButton: code = "126";
                break;
                case R.id.gloRadButton: code = "123";
                break;
                case R.id.mtnRadButton: code = "555";
                break;
            }

            getServiceCodeText().setText(code);
        }

        if (radioGroup.getId() == simRadGroup.getId()){

        }
    }
}
