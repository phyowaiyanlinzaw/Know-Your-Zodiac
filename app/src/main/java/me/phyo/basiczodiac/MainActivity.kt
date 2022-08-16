package me.phyo.basiczodiac

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private var infoTextView : TextView? = null
    private var selectDateBtn : Button? = null
    private var currentZodiacIndex : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView = findViewById(R.id.infoTextView)
        selectDateBtn = findViewById(R.id.selectDateBtn)


        selectDateBtn?.setOnClickListener {
                onClickDateButton()
        }
    }

    private fun onClickDateButton(){

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        val datePicker = DatePickerDialog(
                this,
                { _, _, originalMonth, selectedDay->

                    val selectedMonth = originalMonth+1

                    checkZodiac(selectedDay,selectedMonth)

                },year,month,day
            )
        datePicker.datePicker.maxDate = System.currentTimeMillis() - 86400000
        datePicker.show()
    }

    private fun checkZodiac(day:Int,month:Int){
        when(month){
            1 ->{
                when{
                    day in 0..19 ->{
                        currentZodiacIndex = 9
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 20 ->{
                        currentZodiacIndex = 10
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            2->{
                when{
                    day in 0..18 ->{
                        currentZodiacIndex = 10
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 19 ->{
                        currentZodiacIndex = 11
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            3->{
                when{
                    day in 0..20 ->{
                        currentZodiacIndex = 11
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 21 ->{

                        currentZodiacIndex = 0
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            4->{
                when{
                    day in 0..19 ->{
                        currentZodiacIndex = 0
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 20 ->{
                        currentZodiacIndex = 1
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            5->{
                when{
                    day in 0..20 ->{
                        currentZodiacIndex = 1
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 21 ->{
                        currentZodiacIndex = 2
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            6->{
                when{
                    day in 0..21 ->{
                        currentZodiacIndex = 2
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 22 ->{
                        currentZodiacIndex = 3
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            7 ->{
                when{
                    day in 0..22 ->{
                        currentZodiacIndex = 3
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 23 ->{
                        currentZodiacIndex = 4
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            8->{
                when{
                    day in 0..22 ->{
                        currentZodiacIndex = 4
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 23 ->{
                        currentZodiacIndex = 5
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            9->{
                when{
                    day in 0..22 ->{
                        currentZodiacIndex = 5
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 23 ->{
                        currentZodiacIndex = 6
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            10->{
                when{
                    day in 0..23 ->{
                        currentZodiacIndex = 6
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 24 ->{
                        currentZodiacIndex = 7
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            11->{
                when{
                    day in 0..21 ->{
                        currentZodiacIndex = 7
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 22 ->{
                        currentZodiacIndex = 8
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            12->{
                when{
                    day in 0..21 ->{
                        currentZodiacIndex = 8
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                    day >= 22 ->{
                        currentZodiacIndex = 9
                        val intent = Intent(this,ZodiacViewActivity::class.java)
                        intent.putExtra(Constants.CURRENT_ZODIAC_INDEX,currentZodiacIndex)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

}
