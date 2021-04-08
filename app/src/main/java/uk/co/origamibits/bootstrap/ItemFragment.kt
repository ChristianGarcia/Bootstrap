package uk.co.origamibits.bootstrap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import uk.co.origamibits.bootstrap.databinding.ItemFragmentBinding
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item

@AndroidEntryPoint
class ItemFragment : Fragment() {

    private val viewModel: ItemViewModel by viewModels()

    private val args by navArgs<ItemFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ItemFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.load(args.item.id)
        return binding.root
    }

}