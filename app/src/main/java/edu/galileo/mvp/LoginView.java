package edu.galileo.mvp;

/**
 * Created by smn on 5/23/17.
 */

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUsernameError(int messageResId);

    void setPasswordError(int messageResId);

}
