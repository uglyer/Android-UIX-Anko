package android.support.annotation


enum class Scope  private constructor() {
    /**
     * Restrict usage to code within the same library (e.g. the same
     * gradle group ID and artifact ID).
     */
    LIBRARY,

    /**
     * Restrict usage to code within the same group of libraries.
     * This corresponds to the gradle group ID.
     */
    LIBRARY_GROUP,

    /**
     * Restrict usage to code within the same group ID (based on gradle
     * group ID). This is an alias for [.LIBRARY_GROUP].
     *
     */
    @Deprecated("Use {@link #LIBRARY_GROUP} instead")
    GROUP_ID,

    /**
     * Restrict usage to tests.
     */
    TESTS,

    /**
     * Restrict usage to subclasses of the enclosing class.
     *
     *
     * **Note:** This scope should not be used to annotate
     * packages.
     */
    SUBCLASSES
}
