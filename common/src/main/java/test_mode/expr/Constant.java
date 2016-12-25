package test_mode.expr;

import test_mode.Context;

/**
 * Created by jianggk on 2016/12/20.
 */
public class Constant extends Expression

{

    private int i ;

    public Constant(int i)

    {

        this.i = i;

    }

    public int interpret(Context con)

    {
        return i ;

    }

}
