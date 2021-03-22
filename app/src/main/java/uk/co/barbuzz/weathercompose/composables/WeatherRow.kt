/*
 * Copyright 2021 The Android Open Source Project
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
package uk.co.barbuzz.weathercompose.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uk.co.barbuzz.weathercompose.model.WeatherHour

@ExperimentalAnimationApi
@Composable
fun WeatherRow(weatherHour: WeatherHour, visibleWeatherIcon: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp)
                .weight(2f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility(
                visible = visibleWeatherIcon,
                enter = expandVertically(initialHeight = { 100 }) +
                    fadeIn(0.3f, tween(3000, easing = LinearOutSlowInEasing)),
                exit = fadeOut(0f, tween(400, easing = FastOutLinearInEasing))
            ) {
                Image(
                    painterResource(id = weatherHour.weatherResourceId),
                    contentScale = ContentScale.Fit,
                    contentDescription = null,
                    modifier = Modifier.size(72.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 16.dp)
                .weight(1f),
            horizontalAlignment = Alignment.Start
        ) {
            Text(weatherHour.timeText, style = MaterialTheme.typography.h6)
            Text(weatherHour.tempText, style = MaterialTheme.typography.h3)
            Text(weatherHour.weatherText, style = MaterialTheme.typography.h6)
            Text(weatherHour.windText, style = MaterialTheme.typography.h6)
        }
    }
}
