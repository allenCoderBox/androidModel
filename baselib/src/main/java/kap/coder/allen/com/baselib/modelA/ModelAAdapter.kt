package kap.coder.allen.com.baselib.modelA

import kap.coder.allen.com.baselib.IAction
import kap.coder.allen.com.baselib.IModelAdapter

class ModelAAdapter : IModelAdapter {


    companion object {
        fun buildAction(action: String, unSupport: () -> Unit = {}): IAction? {
            try {
                val clazz = Class.forName(action)
                val action = clazz.newInstance() as? IAction
                if (action == null) {
                    unSupport.invoke()
                }
                return action
            } catch (e: ClassNotFoundException) {
                unSupport.invoke()
            } catch (e: IllegalAccessException) {
                unSupport.invoke()
            } catch (e: InstantiationException) {
                unSupport.invoke()
            }
            return null
        }
    }


}