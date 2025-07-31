package com.melekyazici.jetpackegitim1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.melekyazici.jetpackcomposeegitim.R
import com.melekyazici.jetpackegitim1.ui.theme.JetpackEgitim1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetpackEgitim1Theme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        MyTopBar()
                    }) { innerPadding ->
                    AppNavHost(
                        navController = rememberNavController(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyTopBar() {
        TopAppBar(title = { Text(text = "Top Bar") },
            navigationIcon = {
                Image(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(id = R.drawable.geriok),
                    contentDescription = " "
                )
            }
        )
    }
}

@Composable
fun LoginScreen(navController: NavHostController) {
    Button(onClick = {
        navController.navigate(NavigationItem.Register.route)
    }) {
        Text(text = "Kayıt Ol Sayfasına Git")
    }
}

@Composable
fun RegisterScreen(navController: NavHostController) {
    Button(onClick = {
        navController.navigate(NavigationItem.Login.route)
    }) {
        Text(text = "Giriş Yap Sayfasına Git")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    JetpackEgitim1Theme {

    }
}