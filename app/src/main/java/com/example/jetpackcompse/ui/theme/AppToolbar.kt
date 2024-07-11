package com.example.jetpackcompse.ui.theme

import androidx.annotation.ColorRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcompse.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppToolbar() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text(text = "JetPack Compose")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.baseline_menu_24),tint = Color.White, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(painter =  painterResource(R.drawable.baseline_notifications_24), tint = Color.White,contentDescription = "Notification")
                    }
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.baseline_search_24), tint = Color.White, contentDescription = "Search")
                    }
                },
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}, containerColor = MaterialTheme.colorScheme.tertiary) {
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(R.drawable.baseline_add_circle_24), tint = Color.White, contentDescription = "Add")
                }
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) { innerPadding->
        Text(
            text = "Hello Jetpack Compose",
            modifier = Modifier.padding(innerPadding),
            color = Color.Black
        )
        ShowSwitchCompose()
    }
}

@Composable
fun ShowSwitchCompose() {
    val isChecked =
        remember { mutableStateOf(true) }
    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Switch(
            checked = isChecked.value,
            onCheckedChange = {
                isChecked.value = it
            },
            modifier =
            Modifier.run {
                size(20.dp)
                padding(100.dp)
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                uncheckedThumbColor = Color.White,
                checkedTrackColor = MaterialTheme.colorScheme.tertiary,
                uncheckedTrackColor = Color.Gray
            )
        )
    }

}
