package com.example.listnh

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.listnh.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var modalList = ArrayList<Modal>()
    var name = arrayOf(
        "image1",
        "image1",
        "image1",
        "image1",
        "image1",
        "image1",
        "image1",
        "image1",
        "image1",
        "image1"
    )
    var images = intArrayOf(
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,
        R.drawable.image1,)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        for (i in name.indices){
            modalList.add(Modal(name[i],images[i]))
        }

        var customAdapter = CustomAdapter(modalList,this);
        binding.gvimage.adapter = customAdapter;
        binding.gvimage.setOnItemClickListener { adapterView, view, i, l ->
            modalList[i].name?.let { Log.e("name" , it) };
        }
    }
    class CustomAdapter(
        var itemModel: ArrayList<Modal>,
        var context: Context
    ) : BaseAdapter(){

        var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        override fun getCount(): Int {
          return itemModel.size
        }

        override fun getItem(p0: Int): Any {
            return itemModel[p0]
        }

        override fun getItemId(p0: Int): Long {
           return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {  var itemView: View? = null
            itemView?.let { view ->
            } ?: run {
                itemView = layoutInflater.inflate(R.layout.row_item, p2, false)
            }
            var imageView = itemView?.findViewById<ImageView>(R.id.image1);
//            imageView?.setImageResource(itemModel[p0].image!!)
            return itemView!!
        }

    }
}