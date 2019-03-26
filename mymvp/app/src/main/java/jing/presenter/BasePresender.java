package jing.presenter;


import jing.view.BaseView;

public class BasePresender<V extends BaseView> {

    V view;

    public void attach(V view) {
        this.view = view;
    }

    public void disattach() {
        this.view = null;
    }

    V getView() {
        return this.view;
    }

}
