package app.doggy.checkworkdebug_count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkdebug_count.databinding.ActivityMainBinding

/**
 * 問題9
 * MainActivity.ktのみを修正して、アプリを起動してください。
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

            if (count == 10) {
                binding.countText.setTextColor(Color.RED)
            } else {
                binding.countText.setTextColor(Color.BLUE)
            }
        }
    }
}
