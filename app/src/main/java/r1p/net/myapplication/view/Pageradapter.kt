package r1p.net.myapplication.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class Pageradapter internal constructor(fa: FragmentManager) : FragmentPagerAdapter(fa) {


    override fun getItem(p0: Int): Fragment? {
        var fragment: Fragment? = null
        when (p0) {
            0 -> fragment = BlankFragment()
            1 -> fragment = BlankFragment()
            2 -> fragment = BlankFragment()
        }
        return fragment
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return 3
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Ayarlar"
            1->return "VPN"
            2->return "Hakkında"
       else->return "!"
        }


    }

}