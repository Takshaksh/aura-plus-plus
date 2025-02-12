package com.linuxh2o.aura.ui.common


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.linuxh2o.aura.ui.theme.PrimaryColor
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryBtn(
    title: String,
    bgColor: Color = PrimaryColor,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    onclick: () -> Unit
) {
    Button(
        onClick = { onclick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = Color.White,
            disabledContainerColor = bgColor.copy(alpha = .7f),
            disabledContentColor = Color.White
        ),
        enabled = enabled,
        modifier = modifier
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }
}