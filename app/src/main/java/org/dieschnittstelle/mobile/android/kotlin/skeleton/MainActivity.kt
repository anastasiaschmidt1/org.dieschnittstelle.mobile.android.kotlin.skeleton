package org.dieschnittstelle.mobile.android.kotlin.skeleton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.dieschnittstelle.mobile.android.kotlin.skeleton.ui.theme.MADDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MADDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "MAD WS26",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var usename = name
    var logger = "Greeting"
    Text(
        text = "Hello $name!",
        modifier = modifier.clickable{
            usename +=(" " + usename)
            Log.i(logger, "username is now: $usename")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MADDemoTheme {
        Greeting("MAD")
    }
}