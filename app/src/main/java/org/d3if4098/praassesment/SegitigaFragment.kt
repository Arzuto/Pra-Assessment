package org.d3if4098.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private var alas = 0
private var tinggi = 0

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.setContentView <org.d3if4098.praassesment.databinding.FragmentSegitigaBinding>(this, R.layout.fragment_persegi_panjang)
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
        bHitungSegitiga.setOnClickListener {
            val luas = (alas*tinggi)/2
            tvLuasSegitiga.setText("Luas = "+luas)
            val sisimiring = (tinggi*tinggi)+(alas*alas)
            val keliling : Math.sqrt(sisimiring) + alas + tinggi
            tvKelilingSegitiga.setText("Keliling = "+keliling)
        }
    }


}
