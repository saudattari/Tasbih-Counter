package com.example.tasbih

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

@Preview(showBackground = true, showSystemUi = true, name = "home")
@Composable
fun HomeUI() {
    var counter by remember { mutableStateOf(0) }
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.madina),
        contentDescription = "Background Image",
        contentScale = ContentScale.FillHeight,
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(alpha = 0.3f)
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Black.copy(alpha = 0.3f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    counter = 0
                    Toast.makeText(context, "Count Reset", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.padding(10.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(text = "Reset")
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 30.dp, 0.dp, 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = counter.toString(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 0.dp, vertical = 10.dp)
            )

        }

        Button(
            onClick = { counter++ },
            shape = RoundedCornerShape(100.dp, 100.dp, 0.dp, 0.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(
                text = "Tap",
                color = Color.White,
                fontSize = 70.sp,
                fontFamily = FontFamily.Cursive
            )
        }
    }
}
