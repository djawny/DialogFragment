package com.sdaacademy.jawny.daniel.dialogfragment.dialogs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.sdaacademy.jawny.daniel.dialogfragment.R;

public class RegistrationDialogFragment extends AbstactDialogFragment {
    private EditText registerLogin;
    private EditText registerPassword;
    private EditText registerEmail;
    private Button registerButton;
    private OnRegisterClickListener onRegisterClickListener;

    public interface OnRegisterClickListener {
        void onClick(String login, String password);
    }

    public void setOnRegisterClickListener(OnRegisterClickListener onRegisterClickListener) {
        this.onRegisterClickListener = onRegisterClickListener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_register, container);
        bindViews(view);
        setListener();
        return view;
    }

    private void setListener() {
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onRegisterClickListener != null) {
                    String login = registerLogin.getText().toString();
                    String password = registerPassword.getText().toString();
                    onRegisterClickListener.onClick(login, password);
                } else {
                    Log.v(getClass().getSimpleName(), "No one cares!");
                }
                dismiss();
            }
        });
    }

    private void bindViews(View view) {
        registerLogin = (EditText) view.findViewById(R.id.registerLogin);
        registerPassword = (EditText) view.findViewById(R.id.registerPassword);
        registerEmail = (EditText) view.findViewById(R.id.registerEmail);
        registerButton = (Button) view.findViewById(R.id.registerButton);
    }
}
