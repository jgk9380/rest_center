package editable.enums;

/**
 * Created by jgk93 on 2016/12/18.
 */
public enum InputType {//用于FieldFormMeta
    InputText,InputNumber,InputDate,InputFile,InputBoolean,InputRadio,InputCheckBox,//简单值输入
    Sugestion,SelectOne,//简单做选择输入
    SelectMany, Shuttle;//多选择输入
}
