package com.sdaacademy.jawny.daniel.dialogfragment.dialogs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.sdaacademy.jawny.daniel.dialogfragment.R;

public class RegistrationDialogFragment extends DialogFragment implements View.OnClickListener {

    public interface OnDismissListener {
        void onDismiss();
    }

    private OnDismissListener onDismissListener;

    private static final String TAG = RegistrationDialogFragment.class.getSimpleName();
    private EditText registerLogin;
    private EditText registerPassword;
    private EditText registerEmail;
    private Button registerButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_register, container);
        bindViews(view);
        registerButton.setOnClickListener(this);
        return view;
    }

    private void bindViews(View view) {
        registerLogin = (EditText) view.findViewById(R.id.registerLogin);
        registerPassword = (EditText) view.findViewById(R.id.registerPassword);
        registerEmail = (EditText) view.findViewById(R.id.registerEmail);
        registerButton = (Button) view.findViewById(R.id.registerButton);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.i(TAG, "onDismiss");

        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i(TAG, "onViewStateRestored");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");
    }
}
