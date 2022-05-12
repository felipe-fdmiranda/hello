package me.usuario.androidApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import me.usuario.shared.Greeting
import android.widget.TextView
import android.widget.Toast

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Hello World em Kotlin")

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val tv2: TextView = findViewById(R.id.text_view2)
        tv2.text = "Selecione a disciplina:"

        val tv3: TextView = findViewById(R.id.text_view3)
        tv3.text = "DESENVOLVIMENTO PARA DISPOSITIVOS MÓVEIS"

        val tv4: TextView = findViewById(R.id.textView)
        tv4.text = "Disciplina cadastrada com sucesso!"


    }

    fun clickButton(v: View){
        //Toast.makeText(applicationContext,"Disciplina cadastrada com sucesso!", Toast.LENGTH_SHORT).show()
        showHide(findViewById(R.id.textView))
        showHide(findViewById(R.id.imageView))
    }

    fun showHide(view:View) {
        view.visibility = if (view.visibility == View.VISIBLE){
            View.INVISIBLE
        } else{
            View.VISIBLE
        }
    }
}
