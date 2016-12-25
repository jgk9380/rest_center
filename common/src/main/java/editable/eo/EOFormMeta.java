package editable.eo;


import editable.eo.field.FieldFormMeta;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface EOFormMeta extends EOMeta {
    String getTitle();
    FieldFormMeta getFieldMeta(String name);
}
