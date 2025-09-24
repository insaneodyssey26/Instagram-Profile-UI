package com.example.instagramprofileui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramprofileui.ui.theme.InstagramProfileUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopSection()
        }
    }
}

@Composable
fun TopSection (
    modifier: Modifier = Modifier
) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 40.dp, horizontal = 20.dp),
    ){
        Text(
            text = "insane_odyssey",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
        )
        Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Dropdown")
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 40.dp, horizontal = 20.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add")
        Spacer(modifier = Modifier.width(10.dp))
        Icon(Icons.Default.Menu, contentDescription = "Menu")
    }
}
