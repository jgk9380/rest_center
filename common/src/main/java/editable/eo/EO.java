package editable.eo;


import editable.EOManager;
import editable.eo.field.Field;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface EO {
    EOManager getManager();
    String getName();
    Object getPrimaryKey();
    Field getField(String name);
}
