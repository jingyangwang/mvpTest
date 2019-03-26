package other.presender;

import android.content.Context;

import other.model.OtherModel;
import other.view.OtherThing;

public class OtherThingPresenter extends BaseOtherPresenter<OtherThing> {
    OtherModel otherModel;
    public OtherThingPresenter(){
        otherModel=new OtherModel();
    }
    public void getOtherData(Context context){
        if(getView()!=null){
            String str=otherModel.getdata(context);
            getView().showThingData(str);
        }

    }

}
