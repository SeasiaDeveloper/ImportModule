package org.altbeacon.beaconreference.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityShowAllBeaconBinding extends ViewDataBinding {
    @NonNull
    public final android.support.v7.widget.RecyclerView rvAllBeacon;
    // variables
    protected ActivityShowAllBeaconBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.support.v7.widget.RecyclerView rvAllBeacon1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.rvAllBeacon = rvAllBeacon1;
    }
    //getters and abstract setters
    @NonNull
    public static ActivityShowAllBeaconBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShowAllBeaconBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityShowAllBeaconBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ActivityShowAllBeaconBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityShowAllBeaconBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityShowAllBeaconBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}