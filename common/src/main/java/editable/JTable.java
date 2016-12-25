package editable;


import editable.eo.EO;
import editable.eo.EOTableMeta;

import java.util.List;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface JTable {
    //EOManager getEOManager();
    EOTableMeta getMeta();

    List<EO> getData();

    int getTotalPage();

    int getCurrentPage();

    void nextPage();

    boolean isPermitAllData();

    void loadAllData();//显示所有数据，最大5000条

}
