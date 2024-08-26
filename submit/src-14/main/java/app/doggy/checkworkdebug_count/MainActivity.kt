package app.doggy.checkworkdebug_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkdebug_count.databinding.ActivityMainBinding

/**
 * 問題14
 * 3の倍数で"Fizz"、5の倍数で"Buzz"、15の倍数で"FizzBuzz"、それ以外では数字を表示してください。
 * ログ出力を使ってデバッグしてみましょう！
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

            if (count % 15 == 0) {
                binding.countText.text = "FizzBuzz"
            } else if (count % 3 == 0) {
                binding.countText.text = "Fizz"
            } else if (count % 5 == 0) {
                binding.countText.text = "Buzz"
            } else {
                binding.countText.text = count.toString()
            }
        }
    }
}
