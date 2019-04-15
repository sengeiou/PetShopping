package cn.lovepet.shops.base.baserx;

import java.io.Serializable;

/**
 * author：JSYL-DCL
 * 封装服务器返回常态值
 */
public class BaseRespose<T> implements Serializable {
    public String code;
    public String msg;

    public T data;

    public boolean success() {
        return "1".equals(code);
    }

    @Override
    public String toString() {
        return "BaseRespose{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
