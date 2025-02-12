package com.linuxh2o.aura.navigation

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.IntOffset
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.linuxh2o.aura.ui.aboard.InviteScreen

@Composable
fun NavRouter(
    navHostController: NavHostController,
    startRoute: Route
) {
    val springSpec = spring<IntOffset>(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessLow
    )

    NavHost(
        navController = navHostController,
        startDestination = startRoute.toString()
    ) {
        composable(Route.AboardInvite.toString()){
            InviteScreen()
        }
    }
}