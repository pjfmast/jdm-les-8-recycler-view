package avd.jdm.les2recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.adapter.CatsAdapter
import avd.jdm.les2recyclerview.adapter.EmployeesAdapter
import avd.jdm.les2recyclerview.data.TestDatasources
import avd.jdm.les2recyclerview.ui.GlideImageLoader

class MainActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.main_recycler_view)
    }

    // example Exercise 6.01, employee recyclerlist
    private val employeesAdapter by lazy {
        // todo: add glide dependency, see: https://github.com/bumptech/glide
        EmployeesAdapter(layoutInflater, GlideImageLoader(this))
    }

    // example Exercise 6.02, cats (agents) recyclerlist
    private val catsAdapter by lazy {
        CatsAdapter(layoutInflater, GlideImageLoader(this))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // todo - configure the RecyclerView:
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