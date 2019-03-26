package other.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import other.presender.BaseOtherPresenter;
import other.view.OtherBaseView;

public abstract class OtherBaseActivity<V extends OtherBaseView, P extends BaseOtherPresenter> extends AppCompatActivity {
    P presenter;
    V view;


    abstract int getRlayoutId();

    abstract P createPresenter();

    abstract V createView();

    abstract void init();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getRlayoutId());
        if (presenter == null) {
            presenter = createPresenter();
        }
        if (view == null) {
            view = createView();
        }
        if (presenter != null && view != null) {
            presenter.attach(view);
        }
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null && view != null) {
            presenter.disattach();
        }
    }
}
