package edu.galileo.mvp;

/**
 * Created by smn on 5/23/17.
 */

public interface LoginModel {

    interface OnLoginFinishedListener {

        void onCancelled();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
