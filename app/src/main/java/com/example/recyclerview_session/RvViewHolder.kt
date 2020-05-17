package com.example.recyclerview_session

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvViewHolder(view: View,var context: Context) : RecyclerView.ViewHolder(view){
    /* 로컬 변수로 item 하나의 xml의 구성요소들을 불러와 저장 */
    val imgRvItem : ImageView = view.findViewById(R.id.iv_profile_thumbnail)
    val txtRvItemName : TextView = view.findViewById(R.id.tv_profile_name)
    val txtRvItemInfo : TextView = view.findViewById(R.id.tv_profile_info)


    fun bind(data : RvItem){
        /* 위에서 로컬 변수로 받아놓은 뷰에 실제 데이터가 세팅되도록 관계 설정 */
        imgRvItem.setImageResource(context.resources.getIdentifier("icon_profile_${data.thumbnail}",
            "drawable",javaClass.`package`!!.name.trim()))  // 프로필 이미지 세팅
        txtRvItemName.text = data.name  // 프로필 이름 세팅
        txtRvItemInfo.text = data.info  // 프로필 세부 정보 세팅
    }
}