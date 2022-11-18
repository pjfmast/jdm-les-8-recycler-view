package avd.jdm.les2recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.databinding.ItemEmployeeBinding
import avd.jdm.les2recyclerview.model.EmployeeUiModel
import avd.jdm.les2recyclerview.ui.EmployeeViewHolder
import avd.jdm.les2recyclerview.util.ImageLoader

class EmployeesAdapter(
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<EmployeeViewHolder>() {
    private val employeesData = mutableListOf<EmployeeUiModel>()
    fun setData(employeesData: List<EmployeeUiModel>) {
        this.employeesData.clear()
        this.employeesData.addAll(employeesData)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val itemEmployeeBinding = ItemEmployeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmployeeViewHolder(itemEmployeeBinding, imageLoader)
    }
    override fun getItemCount() = employeesData.size
    override fun onBindViewHolder(holder: EmployeeViewHolder, position:Int) {
        holder.bindData(employeesData[position])
    }
}