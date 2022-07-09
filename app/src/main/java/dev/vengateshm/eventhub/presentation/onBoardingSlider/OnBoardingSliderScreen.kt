package dev.vengateshm.eventhub.presentation.onBoardingSlider

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.presentation.ui.theme.OnBoardingTextContainer
import dev.vengateshm.eventhub.presentation.ui.theme.Screen

@Composable
fun OnBoardingSliderScreen(navController: NavController) {

    val onBoardingItems = remember {
        getOnBoardingItems()
    }

    var position by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White)) {

        Image(
            modifier = Modifier.aspectRatio(3.75f / 4.75f),
            painter = painterResource(id = onBoardingItems[position].drawableRes),
            contentDescription = null)

        Column(modifier = Modifier
            .fillMaxWidth()
            .background(
                color = OnBoardingTextContainer,
                shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp)
            )
            .align(Alignment.BottomCenter)
            .padding(48.dp)) {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = onBoardingItems[position].title,
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = onBoardingItems[position].description,
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(48.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(Screen.SignIn.route)
                    },
                    text = "Skip",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium)
                Text(
                    modifier = Modifier.clickable {
                        if (position >= 0 && position < onBoardingItems.size - 1) {
                            position += 1
                        } else {
                            navController.navigate(Screen.SignIn.route)
                        }
                    },
                    text = "Next",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium)
            }
        }
    }
}