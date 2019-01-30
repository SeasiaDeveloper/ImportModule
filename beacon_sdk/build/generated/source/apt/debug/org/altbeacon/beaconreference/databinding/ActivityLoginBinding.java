package org.altbeacon.beaconreference.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityLoginBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.Button btLogin;
    @NonNull
    public final android.widget.EditText etEmail;
    @NonNull
    public final android.widget.EditText etPassword;
    // variables
    protected ActivityLoginBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.Button btLogin1
        , android.widget.EditText etEmail1
        , android.widget.EditText etPassword1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.btLogin = btLogin1;
        this.etEmail = etEmail1;
        this.etPassword = etPassword1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}