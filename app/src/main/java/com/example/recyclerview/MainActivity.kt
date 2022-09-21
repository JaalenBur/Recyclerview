package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.toHtml
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var item: EditText
    lateinit var price: EditText
    lateinit var link: EditText
    lateinit var button: Button
    lateinit var wishes: MutableList<Wish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        item = findViewById(R.id.Item)
        price = findViewById(R.id.Price)
        link = findViewById(R.id.Link)
        button = findViewById(R.id.button)

        wishes = ArrayList()


        button.setOnClickListener {
         val wish = Wish(item.text.toString(),price.text.toString(),link.text.toString())
          wishes.add(wish)

        }



    }


    class WishAdapter(private val dataSet: Array<String>) :
        RecyclerView.Adapter<WishAdapter.ViewHolder>() {

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val itemTextView: TextView
            val linkTextView: TextView
            val priceTextView: TextView

            init {
                // Define click listener for the ViewHolder's View.
               itemTextView = view.findViewById(R.id.itemTV)
                linkTextView = view.findViewById(R.id.linkTV)
                priceTextView = view.findViewById(R.id.priceTV)
            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.activity_main, viewGroup, false)

            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {



            // Get element from your dataset at this position and replace the
            // contents of the view with that element


        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = dataSet.size

    }

}