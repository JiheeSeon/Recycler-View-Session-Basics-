package com.example.recyclerview_session

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLayout : RecyclerView
    private lateinit var rvAdapter: RvAdapter
    private val rvList = RvDataSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLayout = findViewById(R.id.rv_layout)
        rvAdapter = RvAdapter(this)
        rvLayout.adapter = rvAdapter
        // 리사이클러뷰 내부에 아이템 배치를 어떻게 할지 설정 --> 일렬로
        rvLayout.layoutManager =  LinearLayoutManager(this)
        rvAdapter.data = rvList.getRvitemList()
        rvAdapter.notifyDataSetChanged()
    }
}
