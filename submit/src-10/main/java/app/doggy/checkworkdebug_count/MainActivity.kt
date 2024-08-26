package app.doggy.checkworkdebug_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkdebug_count.databinding.ActivityMainBinding

/**
 * 問題10
 * activity_main.xml内のViewのidを、より良い名前にしてください。
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count: Int = 0

        binding.plusButton.setOnClickListener {
            count += 1
            binding.countText.text = count.toString()
        }
    }
}
