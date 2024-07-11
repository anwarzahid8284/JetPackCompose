package com.example.jetpackcompse

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(color = MaterialTheme.colorScheme.background) {
                LoginScreen()
            }
        }
    }

    private fun loginUser(
        userName: String,
        password: String,
    ) {
        if (userName == "abc" && password == "12345") {
            Toast.makeText(this, "Logged In user success", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "wrong credential", Toast.LENGTH_SHORT).show()
        }
    }
    @Composable
    @Preview(showBackground = true)
    fun LoginScreen() {
        val userName = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Hello Again!",
                fontSize = 20.sp,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Welcome",
                fontSize = 20.sp,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Back!",
                fontSize = 20.sp,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
            )
            OutlinedTextField(
                value = userName.value,
                onValueChange = {
                    userName.value = it
                },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "UserName")
                },
                placeholder = {
                    Text(text = "Enter User Name")
                },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                leadingIcon = { Icon(Icons.Default.Info, contentDescription = "person") },
                label = { Text("Password") },
                placeholder = { Text(text = "Enter Password") },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedButton(
                onClick = { loginUser(userName.value, password.value) },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Login")
            }
        }
    }
}

