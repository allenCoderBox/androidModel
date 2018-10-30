package kap.coder.allen.com.baselib;

import java.util.ArrayList;
import java.util.List;

public class ModleBuss {


    public static List<IAction> list = new ArrayList<>();

    public static final void register(IAction action) {
        list.add(action);
    }

}
