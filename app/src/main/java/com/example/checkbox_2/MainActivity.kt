package com.example.checkbox_2

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textInfoET: EditText
    private lateinit var textRulesEt: EditText

    private lateinit var checkBoxCB: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textInfoET = findViewById(R.id.textInfoET)
        textRulesEt = findViewById(R.id.textRulesET)
        checkBoxCB = findViewById(R.id.checkBoxCB)

        checkBoxCB.setOnCheckedChangeListener{buttonView, isChecked ->
            if (isChecked) {
                textInfoET.setText("Правила дорожного движения")
                textRulesEt.setText("6.2. Круглые сигналы светофора имеют следующие значения:\n" +
                        "\n" +
                        "ЗЕЛЕНЫЙ СИГНАЛ разрешает движение;\n" +
                        "\n" +
                        "ЗЕЛЕНЫЙ МИГАЮЩИЙ СИГНАЛ разрешает движение и информирует, что время его действия истекает и вскоре будет включен запрещающий сигнал (для информирования водителей о времени в секундах, остающемся до конца горения зеленого сигнала, могут применяться цифровые табло);\n" +
                        "\n" +
                        "ЖЕЛТЫЙ СИГНАЛ запрещает движение, кроме случаев, предусмотренных пунктом 6.14 Правил, и предупреждает о предстоящей смене сигналов;\n" +
                        "\n" +
                        "ЖЕЛТЫЙ МИГАЮЩИЙ СИГНАЛ разрешает движение и информирует о наличии нерегулируемого перекрестка или пешеходного перехода, предупреждает об опасности;\n" +
                        "\n" +
                        "КРАСНЫЙ СИГНАЛ, в том числе мигающий, запрещает движение.\n" +
                        "\n" +
                        "Сочетание красного и желтого сигналов запрещает движение и информирует о предстоящем включении зеленого сигнала.")
            } else {
                textInfoET.setText("Информация")
                textRulesEt.text.clear()
            }
        }

    }
}