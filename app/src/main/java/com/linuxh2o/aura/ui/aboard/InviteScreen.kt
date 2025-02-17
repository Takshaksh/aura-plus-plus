package com.linuxh2o.aura.ui.aboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.linuxh2o.aura.R
import com.linuxh2o.aura.ui.common.PrimaryBtn
import com.linuxh2o.aura.ui.theme.BgPrimaryColor
import com.linuxh2o.aura.ui.theme.BgSecondaryColor
import com.linuxh2o.aura.ui.theme.DarkColor
import com.linuxh2o.aura.ui.theme.PaddingMedium
import com.linuxh2o.aura.ui.theme.PaddingSmall
import com.linuxh2o.aura.ui.theme.PrimaryColor
import com.linuxh2o.aura.ui.theme.SecondaryColor
import com.linuxh2o.aura.ui.theme.primaryFont

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
    var inviteCode by remember { mutableStateOf("") }

    // Side Effect Handlers

    Scaffold(
        topBar = {},
        containerColor = BgPrimaryColor
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            Text("Aboard  Invite Screen")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(BgSecondaryColor)
                        .padding(PaddingMedium),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.invite_header_logo),
                        contentDescription = "Invite logo"
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingMedium),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(Modifier.size(16.dp))
                    Text(
                        text = "Enter your invite code",
                        color = SecondaryColor,
                        fontSize = 18.sp,
                        fontFamily = primaryFont,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(Modifier.size(16.dp))

                    TextField(
                        value = inviteCode,
                        onValueChange = { inviteCode = it },
                        placeholder = {
                            Text(
                                "- - - - -",
                                color = DarkColor,
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        },
                        textStyle = TextStyle(
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = SecondaryColor,
                            unfocusedContainerColor = SecondaryColor,
                            focusedTextColor = DarkColor,
                            focusedLabelColor = DarkColor,
                            unfocusedLabelColor = DarkColor,
                            unfocusedTextColor = DarkColor,
                            focusedIndicatorColor = DarkColor,
                            unfocusedIndicatorColor = DarkColor,
                            selectionColors = TextSelectionColors(
                                handleColor = PrimaryColor,
                                backgroundColor = PrimaryColor
                            )

                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(54.dp)
                    )

                    Spacer(Modifier.size(16.dp))

                    PrimaryBtn(
                        title = "Enter Aura Zone",
                        textColor = DarkColor,
                        modifier = Modifier.fillMaxWidth()

                    ) {

                    }
                }
            }
        }
    }
}