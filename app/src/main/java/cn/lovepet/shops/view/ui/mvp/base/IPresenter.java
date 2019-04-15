package cn.lovepet.shops.view.ui.mvp.base;

/**
 * @package: IPresenter
 * @author： JSYL-DCL
 * @describe： Presenter基类
 * @email： 11442865
 */
public class IPresenter<T extends IBaseView> {
    protected T mView;

    /**
     * 绑定View,一般在初始化时执行
     * @param view
     */
    public void attachView(T view){
        this.mView = view;
    }

    /**
     * 解绑View，一般在onDestroy()中执行
     */
    public void detachView(){
        this.mView = null;
    }

    /**
     * 是否已经绑定View,建立关联关系
     * @return
     */
    public boolean isViewAttached(){
        return this.mView != null;
    }
}
