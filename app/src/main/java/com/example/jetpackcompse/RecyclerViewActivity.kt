package com.example.jetpackcompse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompse.ui.theme.JetpackCompseTheme

class RecyclerViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCompseTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    SetAdapter(dummyData())
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RecyclerViewItem(user: User) {
    Card(
        modifier =
            Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        shape = RoundedCornerShape(CornerSize(10.dp))
    ) {
        Row(modifier = Modifier.padding(5.dp).fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.ronaldo),
                contentDescription = "profile",
                modifier =
                    Modifier
                        .size(120.dp)
                        .padding(8.dp)
                        .align(Alignment.CenterVertically)
                        .clip(RoundedCornerShape(CornerSize(10.dp))),
            )
            Text(text = user.description, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
private fun SetAdapter(userList: List<User>) {
    LazyColumn {
        items(userList) { user ->
            RecyclerViewItem(user = user)
        }
    }
}
