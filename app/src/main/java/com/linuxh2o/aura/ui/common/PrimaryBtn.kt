package com.linuxh2o.aura.ui.common


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.linuxh2o.aura.ui.theme.PrimaryColor
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.linuxh2o.aura.ui.theme.DarkColor
import com.linuxh2o.aura.ui.theme.primaryFont

@Composable
fun PrimaryBtn(
    title: String,
    bgColor: Color = PrimaryColor,
    textColor: Color = DarkColor,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    modifier: Modifier = Modifier,
    onclick: () -> Unit
) {
    Button(
        onClick = { onclick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = textColor,
            disabledContainerColor = bgColor.copy(alpha = .7f),
            disabledContentColor = Color.White
        ),
        enabled = enabled,
        shape = shape,
        modifier = modifier
    ) {
        Text(
            text = title,
            color = textColor,
            textAlign = TextAlign.Center,
            fontFamily = primaryFont,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }
}