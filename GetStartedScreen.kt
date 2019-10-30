package io.github.birjuvachhani.composeloginscreenui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview

/*
 * Created by Birju Vachhani on 30 October 2019
 * Copyright © 2019 Compose Login Screen UI. All rights reserved.
 */

@Preview
@Composable
fun GetStartedScreen() {
    val backgroundColor = android.graphics.Color.parseColor("#ffd43f") // yellow background
    MaterialTheme {
        Surface(color = Color(backgroundColor)) {
            Column(
                modifier = Expanded,
                crossAxisAlignment = CrossAxisAlignment.Start,
                mainAxisAlignment = MainAxisAlignment.SpaceBetween
            ) {
                val image = +imageResource(R.drawable.banner2)
                // header image
                Container(modifier = Flexible(flex = 1f), expanded = true) {
                    DrawImage(image)
                }
                
                // bottom text part
                Surface(
                    color = Color(android.graphics.Color.WHITE),
                    shape = RoundedCornerShape(
                        topLeft = 16.dp,
                        bottomLeft = 0.dp,
                        bottomRight = 0.dp,
                        topRight = 16.dp
                    )
                ) {
                    Container(expanded = true, padding = EdgeInsets(all = 24.dp)) {
                        Column(
                            modifier = Expanded
                        ) {
                            Padding(padding = EdgeInsets(top = 8.dp)) {
                                Text(
                                    "Welcome to your\nteam calender,\nMargaret!",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 32.sp,
                                        fontWeight = FontWeight.Bold,
                                        fontFamily = FontFamily.SansSerif
                                    )
                                )
                            }
                            Padding(padding = EdgeInsets(top = 32.dp, bottom = 32.dp)) {
                                Text(
                                    "Here you can see all your meetings and create new ones.",
                                    style = TextStyle(
                                        color = Color.Black
                                    )
                                )
                            }
                            Button(
                                onClick = {},
                                children = {
                                    Container(expanded = true, height = 32.dp) {
                                        Text("Get Started", style = TextStyle(color = Color.White))
                                    }
                                },
                                style = ContainedButtonStyle(rippleColor = Color.White)
                            )
                        }
                    }
                }
            }

        }
    }
}
 