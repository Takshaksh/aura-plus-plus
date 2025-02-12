package com.linuxh2o.aura.ui.aboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.linuxh2o.aura.ui.theme.BgPrimaryColor
import com.linuxh2o.aura.ui.theme.SecondaryColor

@Preview
@Composable
private fun Preview() {
    InviteScreen()
}

@Composable
fun InviteScreen() {
    // Composition Locals
    val context = LocalContext.current

    // Remembered States
    val scope = rememberCoroutineScope()

    // UI-Related States

    // Side Effect Handlers

    Scaffold(
        topBar = {},
        containerColor = SecondaryColor
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            Text("Aboard  Invite Screen")
        }
    }
}