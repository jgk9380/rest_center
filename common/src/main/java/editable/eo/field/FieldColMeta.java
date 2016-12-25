package editable.eo.field;

import editable.enums.TableFooterType;

/**
 * Created by jgk93 on 2016/12/18.
 */
public interface FieldColMeta extends FieldMeta {
    //以下用于表格
    String getHeader();

    TableFooterType getFooterType();

    int getColWidth();

    boolean isFilted();

    boolean isSorted();

}
