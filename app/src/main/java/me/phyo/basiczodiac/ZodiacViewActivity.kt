package me.phyo.basiczodiac

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ZodiacViewActivity : AppCompatActivity() {

    private var zodiacImage : ImageView? = null
    private var zodiacName : TextView? = null
    private var zodiacDate : TextView? = null
    private var basicReadingButton : Button? = null
    private var zodiacsList : ArrayList<Zodiacs>? = null
    private var zCurrentZodiacIndex : Int = 0
    private var dialogTextView : TextView? = null
    private var generalReadingTextView : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zodiac_view)

        zCurrentZodiacIndex = intent.getIntExtra(Constants.CURRENT_ZODIAC_INDEX,0)

        basicReadingButton = findViewById(R.id.basic_reading_button)
        zodiacImage = findViewById(R.id.zodiac_signs_images)
        zodiacName = findViewById(R.id.zodiac_signs_names)
        zodiacDate = findViewById(R.id.zodiac_signs_dates)
        dialogTextView = findViewById(R.id.zodiac_title_dialog)
        generalReadingTextView = findViewById(R.id.general_reading_dialog)

        zodiacsList = Constants.getZodiacs()
        setZodiacs()
       
    }

    private fun setZodiacs() {
        val mainZodiacsList = zodiacsList!![zCurrentZodiacIndex]
        zodiacImage?.setImageResource(mainZodiacsList.image)
        zodiacName?.text = mainZodiacsList.name
        zodiacDate?.text = mainZodiacsList.date
        basicReadingButton?.text = "Get ${mainZodiacsList.name} Reading"
        basicReadingButton?.setOnClickListener {
            showBasicReadingDialog(mainZodiacsList.nameInDialog,mainZodiacsList.readingInDialog)
        }

    }

    private fun showBasicReadingDialog(title:String,reading:String) {
        val basicReadingDialog = Dialog(this)
        basicReadingDialog.setContentView(R.layout.basic_reading_dialog)
        basicReadingDialog.findViewById<Button >(R.id.button_dialog).setOnClickListener {
            basicReadingDialog.dismiss()
        }

        basicReadingDialog.findViewById<TextView>(R.id.zodiac_title_dialog).text = title
        basicReadingDialog.findViewById<TextView>(R.id.general_reading_dialog).text = reading

        basicReadingDialog.show()
    }
}