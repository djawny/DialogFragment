package com.sdaacademy.jawny.daniel.dialogfragment.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.sdaacademy.jawny.daniel.dialogfragment.R;

import butterknife.BindView;
import butterknife.OnClick;

public class RegistrationDialogFragment extends DialogFragment {

    public static final String TAG = RegistrationDialogFragment.class.getSimpleName();

    @BindView(R.id.register_login)
    EditText registerLogin;

    @BindView(R.id.register_password)
    EditText registerPassword;

    @BindView(R.id.register_email)
    EditText registerEmail;

    OnRegisterClickListener onRegisterClickListener;

    public interface OnRegisterClickListener {
        void onClick(String login, String password);
    }

    public void setOnRegisterClickListener(OnRegisterClickListener onRegisterClickListener) {
        this.onRegisterClickListener = onRegisterClickListener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_register, container);
    }

    @OnClick(R.id.register_button)
    public void onRegisterButtonClicked() {
        if (onRegisterClickListener != null) {
            String login = registerLogin.getText().toString().trim();
            String password = registerPassword.getText().toString().trim();
            onRegisterClickListener.onClick(login, password);
        } else {
            Log.d(TAG, "No one cares!");
        }
        dismiss();
    }
}
