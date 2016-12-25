package annotation;



import editable.enums.InputType;
import editable.enums.TableFooterType;

import java.lang.annotation.Retention;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface FielddAnno {
    //字段的信息
    InputType getInputType();

    boolean isEditable();

    String getSelectOptionSql();

    //------------------以下用于表格----------------------

    String getHeader();

    TableFooterType getFooterType();//foot类型

    String getFooterValue();//foot值计算的依据，count，average，sum，计算

    int getColWidth();

    boolean isFilted();

    boolean isSorted();

    //------------------以下用于表单----------------------

    String getLabel();

    int getInputWidth();

    int getInputHeigh();

}
