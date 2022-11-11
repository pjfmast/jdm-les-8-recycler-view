package avd.jdm.les2recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.R
import avd.jdm.les2recyclerview.model.CatUiModel
import avd.jdm.les2recyclerview.ui.CatViewHolder
import avd.jdm.les2recyclerview.ui.ImageLoader


class CatsAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<CatViewHolder>() {
    private val catsData = mutableListOf<CatUiModel>()
    fun setData(catsData: List<CatUiModel>) {
        this.catsData.clear()
        this.catsData.addAll(catsData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = layoutInflater.inflate(R.layout.item_cat, parent, false)
        return CatViewHolder(view, imageLoader)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bindData(catsData[position])
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int = catsData.size
}