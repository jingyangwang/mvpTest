package other.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.wangjingyang.mvptest.R;

import other.presender.OtherThingPresenter;
import other.view.OtherThing;

public class OtherThingActivity extends OtherBaseActivity<OtherThing,OtherThingPresenter> implements OtherThing {

    Button btn;


    @Override
    public void init() {
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getOtherData(OtherThingActivity.this);
            }
        });



    }

//    @Override
//    public OtherThingPresenter creaetePresenter() {
//        return new OtherThingPresenter();
//    }
//
//    @Override
//    public int getLayoutResId() {
//        return R.layout.activity_main;
//    }

    @Override
    int getRlayoutId() {
        return R.layout.activity_main;
    }

    @Override
    OtherThingPresenter createPresenter() {
        return new OtherThingPresenter();
    }

    @Override
    public OtherThing createView() {
        return  this;
    }

    @Override
    public void hideData() {

    }

    @Override
    public void showData() {

    }

    @Override
    public void hideThingData() {

    }

    @Override
    public void showThingData(String str) {
        Toast.makeText(OtherThingActivity.this,str, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        //pv释放
        super.onDestroy();
        //释放其余资源
    }
}
