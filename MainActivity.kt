package com.example.wanderlust

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlust.ui.theme.WanderlustTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WanderlustTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun TextW600(text: String, size: TextUnit = 12.sp, color: Color = Color.Black) {
    Text(
        text = text,
        fontSize = size,
        fontWeight = FontWeight.W600,
        color = color
    )
}

@Composable
fun TextW500(text: String, size: TextUnit = 12.sp, color: Color = Color.Black) {
    Text(
        text = text,
        fontSize = size,
        fontWeight = FontWeight.W500,
        color = color
    )
}

@Composable
fun hSpace(size: Int) {
    Spacer(modifier = Modifier.size(0.dp, size.dp))
}

@Composable
fun wSpace(size: Int) {
    Spacer(modifier = Modifier.size(size.dp, 0.dp))

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginScreen()
}


@Composable
fun LoginScreen() {

    var userName by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), verticalArrangement = Arrangement.Center
    ) {
        TextW600(text = "Login", size = 32.sp)
        hSpace(size = 16)
        OutlinedTextField(value = userName,
            onValueChange = { value -> userName = value },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "User Name"
                )
            })
        hSpace(size = 12)
        OutlinedTextField(value = password,
            onValueChange = { value -> password = value },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "Password"
                )
            })
        hSpace(size = 24)
        Button(
            shape = RoundedCornerShape(8.dp),
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)

        ) {
            TextW600(text = "Login", size = 22.sp, color = Color.White)
        }
        hSpace(size = 24)

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            TextW500(text = "Don't have an Account?", size = 16.sp)
            wSpace(size = 8)
            TextW600(text = "Signup", size = 16.sp, color = Color.Blue)
        }
    }
}

