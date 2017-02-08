package com.sdaacademy.jawny.daniel.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sdaacademy.jawny.daniel.dialogfragment.dialogs.RegistrationDialogFragment;

public class MainActivity extends AppCompatActivity implements RegistrationDialogFragment.OnRegisterClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    public void clickRegister(View view) {
        RegistrationDialogFragment registrationDialogFragment = new RegistrationDialogFragment();
        registrationDialogFragment.setOnRegisterClickListener(this);
        registrationDialogFragment.show(getSupportFragmentManager(), null);

    }

    @Override
    public void onClick(String login, String password) {
        ((TextView)findViewById(R.id.login)).setText(login);
        ((TextView)findViewById(R.id.password)).setText(password);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
