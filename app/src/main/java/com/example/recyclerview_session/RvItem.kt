package com.example.recyclerview_session

data class RvItem(
    var thumbnail : Int,    // 드로어블 리소스가 icon_profile_${thumbnail(번호)} 형태로 저장
    val name : String,      // 사용자의 이름 정보는 null이 불가한 String 타입
    val info : String?      // description이 없는 경우 nullable String 타입
)
