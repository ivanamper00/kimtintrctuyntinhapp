package khan.mhog.kimtintrctuyntinhapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NoInternetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_internet)
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, NoInternetActivity::class.java)
    }
}