package myFragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentsclase2.R

class quintoFrag : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quinto, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menufrg5, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         super.onOptionsItemSelected(item)
        when(item.itemId) {
            R.id.mCoppy -> {
                Toast.makeText(this.context, "Copiado", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.mPaste -> {
                Toast.makeText(this.context, "Pegando", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.mCut -> {
                Toast.makeText(this.context, "Cortando", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return false


    }
}


