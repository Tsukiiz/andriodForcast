package com.example.weatherforcast.ui.landing

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.weatherforcast.databinding.FragmentLandingBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LandingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LandingFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val landingViewModel: LandingViewModel by viewModels()

    //initiate data binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLandingBinding =
            DataBindingUtil.inflate(inflater, com.example.weatherforcast.R.layout.fragment_landing, container, false) as FragmentLandingBinding
            binding.lifecycleOwner = this
            binding.vm = landingViewModel // binding vm(located in xml) with landingViewModel(new LandingViewModel instant)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        landingViewModel.initialize()
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LandingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LandingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}