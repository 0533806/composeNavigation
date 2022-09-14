package com.example.lolvpn

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title:String, var icon:ImageVector, var route:String){

    object Home : BottomNavItem("Home", Icons.Default.Home,"home")
    object Product: BottomNavItem("Product",Icons.Default.Home,"product")
    object Setting: BottomNavItem("Setting",Icons.Default.Home,"setting")

}