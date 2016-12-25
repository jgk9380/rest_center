package annotation;

import editable.enums.TableDataFetchType;
import editable.eo.EO;
import editable.eo.field.FieldColMeta;
import editable.eo.field.FieldMeta;

import java.lang.annotation.Retention;
import java.util.List;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface EoAnno {
    //实体的信息
    boolean isUpdatAble();

    boolean isDeletAble();

    boolean isNewAble();

    //以下用于表单
    String getTitle();

    //以下用于表格
    TableDataFetchType getTableDataFetchType();

    boolean isExported();

    boolean isSorted();

    boolean isFiltered();

    int getPageSize();//0为不分页，默认50；

}
