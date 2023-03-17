package com.example.wanderlust

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wanderlust.ui.theme.WanderlustTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WanderlustTheme {
                RegisterScreen()
            }
        }
    }
}


@Composable
fun RegisterScreen() {

    var userName by remember {
        mutableStateOf(value = "")
    }

    var number by remember {
        mutableStateOf(value = "")
    }
    var email by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }
    var confirmPassword by remember {
        mutableStateOf(value = "")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), verticalArrangement = Arrangement.Center
    ) {
        TextW600(text = "Create Account", size = 32.sp)
        hSpace(size = 16)
        OutlinedTextField(value = userName,
            onValueChange = { value -> userName = value },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "User Name"
                )
            })
        hSpace(size = 16)
        OutlinedTextField(value = number,
            onValueChange = { value -> number = value },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "Mobile Number"
                )
            })
        hSpace(size = 16)
        OutlinedTextField(value = email,
            onValueChange = { value -> email = value },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "Email-Id"
                )
            })
        hSpace(size = 16)
        OutlinedTextField(value = password,
            onValueChange = { value -> password = value },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "Password"
                )
            })
        hSpace(size = 16)
        OutlinedTextField(value = confirmPassword,
            onValueChange = { value -> confirmPassword = value },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            label = {
                TextW500(
                    text = "Confirm Password"
                )
            })
        hSpace(size = 16)
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .border(shape = RoundedCornerShape(8.dp), color = Color.Blue, width = 2.dp),
        ) {
            TextW600(text = "Register", size = 22.sp, color = Color.White)
        }
        hSpace(size = 16)
        TextW600(text = "Already have an Account? Signin", size = 16.sp, color = Color.Blue)
    }
}
