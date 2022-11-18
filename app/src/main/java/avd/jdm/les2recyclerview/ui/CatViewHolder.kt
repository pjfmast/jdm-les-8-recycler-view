package avd.jdm.les2recyclerview.ui

import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.databinding.ItemCatBinding
import avd.jdm.les2recyclerview.model.CatBreed
import avd.jdm.les2recyclerview.model.CatUiModel
import avd.jdm.les2recyclerview.model.Gender
import avd.jdm.les2recyclerview.util.ImageLoader

private val FEMALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9793;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private val MALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9794;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private const val UNKNOWN_SYMBOL = "?"

class CatViewHolder(
    itemCatBinding: ItemCatBinding,
    private val imageLoader: ImageLoader
) : RecyclerView.ViewHolder(itemCatBinding.root) {

    private val catBiographyView = itemCatBinding.itemCatBiography
    private val catBreedView = itemCatBinding.itemCatBreed
    private val catGenderView = itemCatBinding.itemCatGender
    private val catNameView = itemCatBinding.itemCatName
    private val catPhotoView = itemCatBinding.itemCatPhoto


    fun bindData(catData: CatUiModel) {
        imageLoader.loadImage(catData.imageUrl, catPhotoView)
        catNameView.text = catData.name
        catBreedView.text = when (catData.breed) {
            CatBreed.AmericanCurl -> "American Curl"
            CatBreed.BalineseJavanese -> "Balinese-Javanese"
            CatBreed.ExoticShorthair -> "Exotic Shorthair"
        }
        catBiographyView.text = catData.biography
        catGenderView.text = when (catData.gender) {
            Gender.Female -> FEMALE_SYMBOL
            Gender.Male -> MALE_SYMBOL
            else -> UNKNOWN_SYMBOL
        }
    }
}