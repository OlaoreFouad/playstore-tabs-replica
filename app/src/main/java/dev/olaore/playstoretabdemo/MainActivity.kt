package dev.olaore.playstoretabdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout?>(R.id.tab_layout)
        val viewPager = findViewById<ViewPager?>(R.id.view_pager)

        val pagerAdapter = PlayStoreTabsAdapter(supportFragmentManager)
        pagerAdapter.addFragment(HomeFragment())
        pagerAdapter.addFragment(StatusFragment())
        pagerAdapter.addFragment(ChatsFragment())

        viewPager?.adapter = pagerAdapter
        tabLayout?.setupWithViewPager(viewPager)

    }
}

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = TextView(activity)
        textView.text = "Home Fragment"
        return TextView(activity)
    }
}

class ChatsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = TextView(activity)
        textView.text = "Chats Fragment"
        return TextView(activity)
    }
}

class StatusFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = TextView(activity)
        textView.text = "Status Fragment"
        return TextView(activity)
    }
}
