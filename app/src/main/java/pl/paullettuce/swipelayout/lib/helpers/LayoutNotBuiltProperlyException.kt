package pl.paullettuce.swipelayout.lib.helpers

class LayoutNotBuiltProperlyException(private val childCount: Int) : Exception() {
    override val message: String?
        get() {
            return if (childCount == 2) {
                "You have to specify swipe direction side explicitly. You can do that using swipeEnabled xml attribute"
            } else {
                "This layout must have one, two or three children, current children count=$childCount."
            }
        }
}