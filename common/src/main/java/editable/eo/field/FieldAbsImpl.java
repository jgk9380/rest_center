package editable.eo.field;

import editable.eo.EO;

/**
 * Created by jgk93 on 2016/12/19.
 */
public abstract class FieldAbsImpl<T> implements Field<T> {
    EO eo;
    String name;
    T value;

    public EO getEo() {
        return eo;
    }

    public String getName() {
        return name;
    }

    public String getOutputValue() {
        return value.toString();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value=value;

    }


}

