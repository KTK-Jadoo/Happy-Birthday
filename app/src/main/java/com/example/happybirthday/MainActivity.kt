package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HAPPYBIRTHDAYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HAPPYBIRTHDAYTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    GreetingText(
                        message = "Happy Birthday Kian!",
                        from = "From Kartikeya",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    // Because the content parameter is the last one in the function signature
    // and you pass its value as a lambda expression (for now, it's okay if you
    // don't know what a lambda is, just familiarize yourself with the syntax),
    // you can remove the content parameter and the parentheses as follows:

    Column(
        verticalArrangement = Center,
        modifier = modifier
    ) {
        //Recollect that you need to pass the modifier parameter to the child
        // element in the composables. That means you need to pass the modifier
        // parameter to the Column composable.

        Text(
            text = message,
            modifier = modifier,
            fontSize = 50.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HAPPYBIRTHDAYTheme {
         GreetingText(message = "Happy Birthday Poo", from = "From Emma")
    }
}