package cl.awakelab.sprint40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelab.sprint40.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ZapatoCallback {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        adapter.setZapatoCallback(this)
        adapter.setData(Zapatos.zapatos)
        binding.recyclerView.adapter = adapter
    }

    override fun showZapato(s: String) {
        binding.textView3.text = s
    }
}