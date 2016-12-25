package editable.eo.field;

import editable.enums.InputType;

import java.util.Map;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface FieldFormMeta extends FieldMeta {
    //用于表单
    InputType getInputType();

    String getLabel();

    int getInputWidth();

    int getInputHeigh();

    Map<String,Object> getSelectOption();

}
