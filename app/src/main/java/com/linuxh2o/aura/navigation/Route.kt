package com.linuxh2o.aura.navigation

private object RouteConfig {
    const val ABOARD_INVITE = "aboard_invite"
    const val ABOARD_COMPLETE = "aboard_complete"
    const val HOME = "home"
    const val PROFILE = "profile"
}

sealed class Route(route: String) {
    data object AboardInvite: Route(RouteConfig.ABOARD_INVITE)
    data object AboardComplete: Route(RouteConfig.ABOARD_COMPLETE)
    data object Home: Route(RouteConfig.HOME)
    data object Profile: Route(RouteConfig.PROFILE)
}