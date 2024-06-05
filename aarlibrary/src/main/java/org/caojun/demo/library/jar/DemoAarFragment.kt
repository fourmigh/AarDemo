package org.caojun.demo.library.jar

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.caojun.demo.library.jar.databinding.FragmentDemoAarBinding

class DemoAarFragment : Fragment() {

    private var _binding: FragmentDemoAarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDemoAarBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textView.text = "${binding.textView.text}\n${DemoAar.TAG}\n${BuildConfig.LibraryVersion}"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}