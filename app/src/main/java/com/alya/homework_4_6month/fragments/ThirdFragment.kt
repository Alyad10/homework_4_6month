package com.alya.homework_4_6month.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alya.homework_4_6month.viewmodel.MyViewModel
import com.alya.homework_4_6month.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var viewModel: MyViewModel
    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[MyViewModel::class.java]
        viewModel._operations.observe(viewLifecycleOwner, Observer {
            binding.textResult2.text = ""
            it.map { operation ->
                binding.textResult2.append("$operation ")
            }
        })


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
