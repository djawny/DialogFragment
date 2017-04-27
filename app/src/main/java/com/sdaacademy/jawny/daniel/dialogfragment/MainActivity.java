package com.sdaacademy.jawny.daniel.dialogfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sdaacademy.jawny.daniel.dialogfragment.dialog.RegistrationDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements RegistrationDialogFragment.OnRegisterClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.login)
    TextView mLogin;

    @BindView(R.id.password)
    TextView mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.i(TAG, "onCreate");
    }

    @OnClick(R.id.register_account_button)
    public void onRegisterAccountButtonClicked(View view) {
        RegistrationDialogFragment registrationDialogFragment = new RegistrationDialogFragment();
        registrationDialogFragment.setOnRegisterClickListener(this);
        registrationDialogFragment.show(getSupportFragmentManager(), null);
    }

    @Override
    public void onClick(String login, String password) {
        mLogin.setText(login);
        mPassword.setText(password);
    }
}
