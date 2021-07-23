package ir.danialchoopan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv_number:TextView

    var number_save=0.0
    var amad=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_plus=findViewById<Button>(R.id.btn_plus)
        val btn_mins=findViewById<Button>(R.id.btn_mins)
        val btn_milti=findViewById<Button>(R.id.btn_milti)
        val btn_devetion=findViewById<Button>(R.id.btn_devetion)
        val btn_equ=findViewById<Button>(R.id.btn_equ)
        tv_number=findViewById<TextView>(R.id.tv_number)


        btn_plus.setOnClickListener {
            number_save=tv_number.text.toString().toDouble()
            tv_number.text="0"
            amad="+"
        }

        btn_mins.setOnClickListener {
            number_save=tv_number.text.toString().toDouble()
            tv_number.text="0"
            amad="-"
        }

        btn_milti.setOnClickListener {
            number_save=tv_number.text.toString().toDouble()
            tv_number.text="0"
            amad="*"
        }

        btn_devetion.setOnClickListener {
            number_save=tv_number.text.toString().toDouble()
            tv_number.text="0"
            amad="/"
        }

        btn_equ.setOnClickListener {
            when(amad){
                "+"->{
                    val number1=number_save
                    val number2=tv_number.text.toString().toInt()
                    val result=number1+number2
                    tv_number.text=result.toString()
                }
                "-"->{
                    val number1=number_save
                    val number2=tv_number.text.toString().toInt()
                    val result=number1-number2
                    tv_number.text=result.toString()
                }
                "*"->{
                    val number1=number_save
                    val number2=tv_number.text.toString().toInt()
                    val result=number1*number2
                    tv_number.text=result.toString()

                }
                "/"->{
                    val number1=number_save
                    val number2=tv_number.text.toString().toInt()
                    val result=number1/number2
                    tv_number.text=result.toString()
                }

            }
        }





    }

    fun onClickNumber(view: View){
        val btn=view as Button
        if(tv_number.text.toString().trim() == "0") {
            tv_number.text = btn.text
        }else{
            tv_number.append(btn.text)
        }

    }


}