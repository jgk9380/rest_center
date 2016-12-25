package editable.eo.field;


import editable.eo.EO;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface Field<T> {
    EO getEo();
    String getName();
    String getOutputValue();//界面上显示的值
    T getValue();
    void setValue(T value);//如何支持数组类数据？
}
