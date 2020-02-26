package org.d3if4098.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    private var panjang = 0
    private var lebar = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.setContentView <FragmentPersegiPanjangBinding>(this, R.layout.fragment_persegi_panjang)
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
        bHitung.setOnClickListener {
            val luas = panjang*lebar
            tvLuasPersegiPanjang.setText("Luas = "+luas)
            val keliling = 2*(panjang*lebar)
            tvKelilingPersegiPanjang.setText("Keliling = "+keliling)
        }
    }

    }


}
