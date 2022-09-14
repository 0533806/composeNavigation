package com.example.lolvpn

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lolvpn.screen.HomeScreen
import com.example.lolvpn.screen.ProductScreen
import com.example.lolvpn.screen.SettingScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Product.route) {
            ProductScreen()
        }
        composable(BottomNavItem.Setting.route) {
            SettingScreen()
        }
    }
}