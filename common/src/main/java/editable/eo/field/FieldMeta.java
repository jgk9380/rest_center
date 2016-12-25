package editable.eo.field;


import editable.enums.InputType;
import editable.enums.ValueType;

import java.util.Map;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface FieldMeta {

    boolean isPrimaryKey();

    boolean isEditable();

    ValueType getValueType();//如果是list，则需要listClass信息

    Class getListClass();

}
