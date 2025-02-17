package com.linuxh2o.aura.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.linuxh2o.aura.R
import com.linuxh2o.aura.ui.theme.BgPrimaryColor
import com.linuxh2o.aura.ui.theme.PaddingMedium
import com.linuxh2o.aura.ui.theme.getTopAppBArColor

@Preview
@Composable
private fun Preview() {
    HomeScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    // Composition Locals
    val context = LocalContext.current

    // Remembered States
    val scope = rememberCoroutineScope()

    // UI-Related States

    // Side Effect Handlers

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        painter = painterResource(R.drawable.logo_horizontal),
                        contentDescription = "Invite logo"
                    )
                },
                modifier = Modifier.shadow(elevation = 4.dp),
                colors = getTopAppBArColor(),
                actions = {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_setting),
                            contentDescription = null
                        )
                    }
                }
            )
        },
        containerColor = BgPrimaryColor
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Spacer(Modifier.size(16.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingMedium),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                }
            }
        }
    }
}