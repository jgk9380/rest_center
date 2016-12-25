package editable.eo;


import editable.enums.TableDataFetchType;
import editable.eo.field.FieldColMeta;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface EOTableMeta extends EOMeta {
    String getTitle();
    TableDataFetchType getTableDataFetchType();
    FieldColMeta getFieldMeta(String name);
    boolean isExported();
    boolean isSorted();
    boolean isFiltered();
    int getPageSize();//0为不分页，默认50；
    boolean isFootered();//是否有合计栏，根据field计算
    String getFieldFooterString(String name);//计算Footer内容
}
