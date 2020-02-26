package org.d3if4098.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentMainFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.bPersegiPanjang.setOnClickListener{
        v: View -> v.findNavController().navigate(MainFragmentDirections.actionMainFragmentToPersegiPanjangFragment())
        }
        binding.bSegitiga.setOnClickListener{
            v: View -> v.findNavController().navigate(MainFragmentDirections.actionMainFragmentToSegitigaFragment())
        }
        setHasOptionsMenu(true)
        return binding.root
    }


}
