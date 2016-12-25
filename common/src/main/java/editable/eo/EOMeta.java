package editable.eo;


import editable.eo.EO;
import editable.eo.field.FieldMeta;

import java.util.List;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface EOMeta {
    List<String> getFieldNameList();
    FieldMeta getFieldMeta(String name);
    boolean isUpdatAble();
    boolean isDeletAble();
    boolean isNewAble();
    EO getEo(Object id);
}
