/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.neobyte.feature.list.navigation

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.neobyte.apps.core.navigation.NiaNavigationDestination
import com.neobyte.feature.list.ForYouRoute

object ListDestination : NiaNavigationDestination {
    override val route = "list_route"
    override val destination = "list_destination"
}

fun NavGraphBuilder.listGraph(
    windowSizeClass: WindowSizeClass
) {
    composable(route = ListDestination.route) {
        ForYouRoute(windowSizeClass)
    }
}
