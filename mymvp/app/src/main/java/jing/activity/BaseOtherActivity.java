package jing.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import jing.presenter.BasePresender;
import jing.view.BaseView;


public abstract class BaseOtherActivity<V extends BaseView, P extends BasePresender> extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        if (presenter == null) {
            presenter = creaetePresenter();
        }
        if (view == null) {
            view = createView();
        }
        if (presenter != null && view != null) {
//            presenter.attach(view);
        }
        init();
    }

    public abstract void init();

  public   P presenter;
   public  V view;

    public abstract P creaetePresenter();
    public abstract  int getLayoutResId();
    public abstract V createView();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null && view != null) {
            presenter.disattach();

        }
    }
}




