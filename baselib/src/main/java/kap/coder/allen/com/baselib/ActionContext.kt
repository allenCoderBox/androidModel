package kap.coder.allen.com.baselib

class ActionContext private constructor(val target: Any) {
    companion object {
        fun create(target: Any): ActionContext {
            return ActionContext(target)
        }
    }

    private val map = mutableMapOf<String, Any?>()


    fun addParams(key: String, value: Any?): ActionContext {
        map[key] = value
        return this
    }


    @Suppress("UNCHECKED_CAST")
    fun <T> getParams(key: String): T? {
        return map[key] as? T
    }


}