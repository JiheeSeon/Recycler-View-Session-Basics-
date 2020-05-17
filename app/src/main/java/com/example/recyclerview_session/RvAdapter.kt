package com.example.recyclerview_session

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(private val context : Context) : RecyclerView.Adapter<RvViewHolder>(){
    var data = listOf<RvItem>()

    // 어댑터는 아이템마다 뷰홀더 만드는 방법 정의해야 한다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent, false)
        return RvViewHolder(view,context)
    }
    // 어댑터는 전체 아이템 개수를 알아야 한다.
    override fun getItemCount(): Int {
        return data.size
    }
    // 어댑터가 뷰홀더에 데이터를 전달해야 한다. --> 뷰홀더에서 실질적으로 데이터와 바인딩하는 작업 수행
    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(data[position])
    }

}