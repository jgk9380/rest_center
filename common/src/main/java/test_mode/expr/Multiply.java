package test_mode.expr;

import test_mode.Context;

/**
 * Created by jianggk on 2016/12/20.
 */
public class Multiply extends Expression

{

    private Expression left , right ;

    public Multiply(Expression left , Expression right)

    {

        this.left = left ;

        this.right= right ;

    }

    public int interpret(Context con)

    {

        return left.interpret(con) * right.interpret(con);

    }

}
