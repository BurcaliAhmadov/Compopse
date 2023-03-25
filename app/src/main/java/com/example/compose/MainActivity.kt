package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainScreen()
        }
    }
}

@Composable
fun mainScreen(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center
    , horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.padding(20.dp))
        TextCompose(text = "Hello Android")
        Spacer(modifier = Modifier.padding(20.dp))

        TextCompose(text = "Hello World")
        Spacer(modifier = Modifier.padding(50.dp))

        Row(modifier = Modifier.fillMaxWidth()
        , horizontalArrangement = Arrangement.SpaceEvenly
            , verticalAlignment = Alignment.CenterVertically

        ) {
            //Spacer(modifier = Modifier.padding(20.dp))
            TextCompose(text = "Hello b")
            //Spacer(modifier = Modifier.padding(20.dp))
            TextCompose(text = "Hello a")
        }


    }


}
@Composable
fun TextCompose(text: String){
    Text(text = text
        ,
        Modifier
            .clickable {
                println("Click")
            }
            .background(color = Color.Black)
            .padding(all = 5.dp)

            //.fillMaxSize(0.5f)
            .padding(horizontal = 20.dp)
        , color = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    mainScreen()
}

