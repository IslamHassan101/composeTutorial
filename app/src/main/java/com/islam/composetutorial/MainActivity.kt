package com.islam.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.islam.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeTutorial()
                }
            }
        }
    }
}

@Composable
private fun ComposeTutorial() {

    Column() {
        ComposeTutorialImage()
        ComposeTutorialTitleText(title = "Jetpack Compose tutorial")
        ComposeTutorialDescText1(desc = stringResource(id = R.string.desc1))
        ComposeTutorialDescText2(desc = stringResource(id = R.string.desc2))
    }

}


@Composable
private fun ComposeTutorialImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)

}

@Composable
private fun ComposeTutorialTitleText(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(all = 16.dp)
    )
}

@Composable
private fun ComposeTutorialDescText1(desc: String) {
    Text(
        text = desc,
        fontSize = 18.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
private fun ComposeTutorialDescText2(desc: String) {
    Text(
        text = desc, fontSize = 18.sp, textAlign = TextAlign.Justify,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(all = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun ComposeTutorialPreview() {
    ComposeTutorial()
}

