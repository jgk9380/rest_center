package test_mode.expr;

import test_mode.Context;

/**
 * Created by jianggk on 2016/12/20.
 */
public class Variable extends Expression

{

    public int interpret(Context con)

    {

        //this为调用interpret方法的Variable对象

        return con.LookupValue(this);

    }

}
