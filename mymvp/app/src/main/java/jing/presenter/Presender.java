package jing.presenter;


import jing.com.jing.model.Model;
import jing.view.ThingView;

public class Presender extends BasePresender<ThingView>{
    Model model;
    public  Presender(){
        this.model=new Model();
    }

    public void getdata(){


       getView().showThingView(model.getData());
    }

}
