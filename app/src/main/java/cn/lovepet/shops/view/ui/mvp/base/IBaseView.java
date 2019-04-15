package cn.lovepet.shops.view.ui.mvp.base;

import com.uber.autodispose.AutoDisposeConverter;

/**
 * @package: IBaseView
 * @author： JSYL-DCL
 * @describe： View基类
 * @email： 11442865
 */
public interface IBaseView {
    /**
     * 进度展示
     */
    void showLoading();

    /**
     * 关闭进度
     */
    void cancelLoading();

    /**
     * 错误异常
     * @param throwable 异常体
     */
    void onError(Throwable throwable);

    /**
     * 错误
     * @param e 异常信息
     */
    void onError(String e);

    /**
     * 绑定Android生命周期，避免Rxjava内存泄漏
     * @param <T>
     * @return
     */
    <T>AutoDisposeConverter<T> bindAutoDispose();


}
