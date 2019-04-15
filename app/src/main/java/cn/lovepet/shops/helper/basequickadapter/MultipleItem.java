package cn.lovepet.shops.helper.basequickadapter;

import com.github.library.entity.MultiItemEntity;

/**
 * Created by dingcl
 */
public class MultipleItem implements MultiItemEntity {

    public static final int HEADER = 1;
    public static final int CONTENT = 2;
    public static final int CONTENT3 = 3;

    public String name;

    public int itemType;

    @Override
    public int getItemType() {
        return itemType;
    }
}
