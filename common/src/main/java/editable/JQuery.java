package editable;

import editable.eo.EO;

import java.util.List;

/**
 * Created by jianggk on 2016/12/20.
 */
public interface JQuery {
    //EOManager getEOManager();
    EO findOne();
    List<EO> queryList();
}
