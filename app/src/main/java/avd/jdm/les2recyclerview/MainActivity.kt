package avd.jdm.les2recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import avd.jdm.les2recyclerview.adapter.CatsAdapter
import avd.jdm.les2recyclerview.adapter.EmployeesAdapter
import avd.jdm.les2recyclerview.data.TestDatasources
import avd.jdm.les2recyclerview.databinding.ActivityMainBinding
import avd.jdm.les2recyclerview.ui.GlideImageLoader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    // example Exercise 6.01, employee recyclerlist
    private val employeesAdapter by lazy {
        // todo: add glide dependency, see: https://github.com/bumptech/glide
        EmployeesAdapter(GlideImageLoader(this))
    }

    // example Exercise 6.02, cats (agents) recyclerlist
    private val catsAdapter by lazy {
        CatsAdapter(GlideImageLoader(this))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // todo - configure the RecyclerView:
        val recyclerView = binding.mainRecyclerView
//        recyclerView.adapter = employeesAdapter
        recyclerView.adapter = catsAdapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        employeesAdapter.setData(
            TestDatasources().loadEmployees()
        )
        catsAdapter.setData((
                TestDatasources().loadCats()
                ))

    }
}