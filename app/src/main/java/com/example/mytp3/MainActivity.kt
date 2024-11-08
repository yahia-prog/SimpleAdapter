package com.example.mytp3



import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ListView
        val listView: ListView = findViewById(R.id.listView)

        // Data to be displayed in the ListView
        val items: List<Map<String, String>> = listOf(
            mapOf("title" to "Club", "description" to "Madrid"),
            mapOf("title" to "Legend : ", "description" to "Zidane"),
            mapOf("title" to "Legend : ", "description" to "Ramos"),
            mapOf("title" to "Legend : ", "description" to "Toni"),
            mapOf("title" to "GOAT   : ", "description" to "Ronaldo")
        )

        // Keys from the map to use in the adapter
        val from = arrayOf("title", "description")


        val to = intArrayOf(R.id.titleTextView, R.id.descriptionTextView)

        // Set up the SimpleAdapter
        val adapter = SimpleAdapter(this, items, R.layout.item_text, from, to)
        listView.adapter = adapter
    }
}