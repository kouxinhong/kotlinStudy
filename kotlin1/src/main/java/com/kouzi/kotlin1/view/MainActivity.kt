package kouzi.com.kotlin1.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kouzi.com.kotlin.R
import kouzi.com.kotlin.databinding.ActivityMainBinding
import kouzi.com.kotlin1.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.navigation_home -> {
//                message.setText(R.string.title_home)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_dashboard -> {
//                message.setText(R.string.title_dashboard)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_notifications -> {
//                message.setText(R.string.title_notifications)
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
      //  var repository = Repository("Medium Android Repository Article", "Fleka", 1000, true)

//        binding.apply {
//        repositoryName.text = "Medium Android Repository Article"
//        repositoryOwner.text = "Fleka"
//        numberOfStarts.text = "1000 stars"sitory
//        binding.executePendingBindings()
//        Handler().postDelayed({repository.repositoryName="New Name"}, 2000)

//        Handler().postDelayed({repository.repositoryName="New Name"
//            binding.repository = repository
//            binding.executePendingBindings()}, 2000)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.executePendingBindings()

    }
}
