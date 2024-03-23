import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.hw35.R
import com.example.hw35.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var btnOne : Button
    private lateinit var tvResult : TextView
    private lateinit var binding : ActivityMainBinding
    private  var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    btnOne.setOnClickListener {
        if (counter < 10) {
            counter++
            tvResult.text = counter.toString()
            if (counter == 10) {
                btnOne.text = "-1"
            }
        } else {
            counter--
            tvResult.text = counter.toString()
            if (counter == 0) {
                replaceFragment(SecondFragment())
            }
        }
    }
}

private fun replaceFragment(fragment: SecondFragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.fragmentContainer, fragment)
        .addToBackStack(null)
        .commit()
}
}

