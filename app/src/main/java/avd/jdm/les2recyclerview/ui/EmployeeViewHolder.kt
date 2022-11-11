package avd.jdm.les2recyclerview.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.R
import avd.jdm.les2recyclerview.model.EmployeeRole
import avd.jdm.les2recyclerview.model.EmployeeUiModel
import avd.jdm.les2recyclerview.model.Gender


private val FEMALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9793;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}

private val MALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9794;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private const val UNKNOWN_SYMBOL = "?"

class EmployeeViewHolder(
    containerView: View,
    private val imageLoader: ImageLoader
) : RecyclerView.ViewHolder(containerView) {
    private val employeeNameView: TextView
            by lazy { containerView.findViewById(R.id.item_employee_name) }
    private val employeeRoleView: TextView
            by lazy { containerView.findViewById(R.id.item_employee_role) }
    private val employeeBioView: TextView
            by lazy { containerView.findViewById(R.id.item_employee_biography) }
    private val employeeGenderView: TextView
            by lazy { containerView.findViewById(R.id.item_employee_gender) }
    private val employeePhotoView: ImageView
            by lazy { containerView.findViewById(R.id.item_employee_photo) }

    fun bindData(employeeData: EmployeeUiModel) {
        imageLoader.loadImage(employeeData.imageUrl, employeePhotoView)
        employeeNameView.text = employeeData.name
        employeeRoleView.text = when (employeeData.role) {
            EmployeeRole.HumanResources -> "Human Resources"
            EmployeeRole.Management -> "Management"
            EmployeeRole.Technology -> "Technology"
        }
        employeeBioView.text = employeeData.biography
        employeeGenderView.text = when (employeeData.gender) {
            Gender.Female -> FEMALE_SYMBOL
            Gender.Male -> MALE_SYMBOL
            else -> UNKNOWN_SYMBOL
        }
    }
}