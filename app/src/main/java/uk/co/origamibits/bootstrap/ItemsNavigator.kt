package uk.co.origamibits.bootstrap

import android.app.Activity
import androidx.navigation.findNavController
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item
import javax.inject.Inject

class ItemsNavigator @Inject constructor(private val activity: Activity) {

    fun navigateToItem(item: Feature1Item) {
        activity.findNavController(R.id.nav_host_fragment)
            .navigate(ItemsFragmentDirections.actionItemsFragmentToItemFragment(item))
    }

}
