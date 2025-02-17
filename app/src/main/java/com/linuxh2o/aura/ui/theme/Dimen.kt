package com.linuxh2o.aura.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * This will apply on buttons and other shapes by default
 * */
val DefaultShape = Shapes(
    extraSmall = RoundedCornerShape(2.dp),
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(32.dp)
)

val ButtonRadius = DefaultShape.medium

// Basic padding values
val PaddingSmall = 8.dp
val PaddingMedium = 16.dp
val PaddingLarge = 24.dp
val PaddingExtraLarge = 32.dp

// Specialized padding for horizontal, vertical, buttons, and icons
val PaddingHorizontal = 16.dp
val PaddingVertical = 12.dp
val PaddingButton = 12.dp
val PaddingIcon = 8.dp