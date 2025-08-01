package com.melekyazici.jetpackegitim1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
    navController: NavHostController,
    startDestination:String=NavigationItem.Login.route
){
    NavHost(modifier = modifier,
        navController = navController, startDestination = startDestination) {
        composable(NavigationItem.Login.route) {
            LoginScreen(navController)
        }
        composable(NavigationItem.Register.route) {
            RegisterScreen(navController)
        }
        
    }
    
}