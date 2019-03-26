package other.presender;

import other.view.OtherBaseView;

public class BaseOtherPresenter<V extends OtherBaseView> {

    V view;


    public void attach(V view){
        this.view=view;
    }

    public void disattach(){
        this.view=null;
    }
   public  V getView(){
        return this.view;

    }


}
