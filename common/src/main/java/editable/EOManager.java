package editable;


import editable.eo.EO;
import editable.eo.EOFormMeta;
import editable.eo.EOTableMeta;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface EOManager {
    // List<String> getEoMetaList();
    EOTableMeta getTableMeta(String name);//取tableEoMeta

    EOFormMeta getFormMeta(String name);//取tableEoMeta

    EO getEO(String name, Object id);

    void saveOrAdd(EO eo);

    void delete(EO eo);

    EO produceEO(String name);
}
