package test_mode;

import test_mode.expr.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianggk on 2016/12/20.
 */
 public class Context

{

    private Map valueMap = new HashMap();

    public void addValue(Variable x , int y)

    {

        Integer yi = new Integer(y);

        valueMap.put(x , yi);

    }

    public int LookupValue(Variable x)

    {

        int i = ((Integer)valueMap.get(x)).intValue();

        return i ;

    }

}
