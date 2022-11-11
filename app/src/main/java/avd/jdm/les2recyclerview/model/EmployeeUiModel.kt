package avd.jdm.les2recyclerview.model

// see: https://kotlinlang.org/docs/data-classes.html
data class EmployeeUiModel(
    val name: String,
    val biography: String,
    val role: EmployeeRole,
    val gender: Gender,
    val imageUrl: String
)
