package uk.co.origamibits.bootstrap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uk.co.origamibits.bootstrap.databinding.FragmentItemsBinding
import javax.inject.Inject

@AndroidEntryPoint
class ItemsFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var adapter: ItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentItemsBinding = FragmentItemsBinding.inflate(inflater, container, false)
        binding.itemsView.adapter = adapter
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

}