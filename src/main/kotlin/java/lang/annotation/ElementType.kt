package java.lang.annotation


enum class ElementType private constructor() {
    ANNOTATION_TYPE,
    CONSTRUCTOR,
    FIELD,
    LOCAL_VARIABLE,
    METHOD,
    PACKAGE,
    PARAMETER,
    TYPE,
    TYPE_PARAMETER,
    TYPE_USE
}
