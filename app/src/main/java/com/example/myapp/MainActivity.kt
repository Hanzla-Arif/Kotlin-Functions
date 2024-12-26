package com.example.myapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var name: String
    private lateinit var userNames:String
    //Non Nullable
    private var value1: String? = null
    private var value2: String? = null
    private var sum: Int by Delegates.notNull()
    private val names by lazy {
        "Usama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Before Initialization
        try {
            Toast.makeText(this, binding.edt1.text.toString(), Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Log.e("Exception", e.toString())
        }
//After Initialization
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        withScopeFun()

    }

    fun click(view: View) {
        names
        init()
        values()
        displayName()
    }

   private  fun init() {
        try {
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Log.e("Exception", e.toString())
        }
        //After Initialization
        name = "Hanzala"
        Log.e("name", name)
        Log.e("names", names)
    }

     private fun values() {
        value1 = binding.edt1.text.toString()
        value2 = binding.edt2.text.toString()
        Log.e("value", value1.toString())
        Log.e("value2", value2.toString())

        //Before
        try {
            Log.e("sum", (sum.toString()))
        } catch (e: Exception) {
            Log.e("sum", e.toString())
        }
      //After
        sum = 90
        Log.e("sum2", sum.toString())

    }

   private fun displayName() {
        Handler(Looper.getMainLooper()).postDelayed({
            val userName = "Usama" // Simulated fetched data
            userNames = "Welcome, $userName!"
            binding.edt1.setText(userNames)
        }, 2000)

    }
    private fun withScopeFun(){
        val value=with(binding){
            edt1.setText("Hanzala")
            edt2.setText("Ali")
            "Hello how are you"
        }
        Toast.makeText(this,value,Toast.LENGTH_SHORT).show()
    }
}