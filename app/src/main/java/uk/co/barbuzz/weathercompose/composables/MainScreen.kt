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

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uk.co.barbuzz.weathercompose.repo.WeatherRepo
import uk.co.barbuzz.weathercompose.theme.brown100
import uk.co.barbuzz.weathercompose.theme.brown200
import uk.co.barbuzz.weathercompose.theme.brown300
import uk.co.barbuzz.weathercompose.theme.brown400

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun MainScreen() {
    val weatherHours = WeatherRepo().getWeatherForToday()

    var weatherRowState1 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow1 = updateTransition(targetState = weatherRowState1)
    val rowHeightAnim1 by transitionRow1.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 100.dp
            WeatherRowState.Large -> 200.dp
        }
    }

    var weatherRowState2 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow2 = updateTransition(targetState = weatherRowState2)
    val rowHeightAnim2 by transitionRow2.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 200.dp
            WeatherRowState.Large -> 300.dp
        }
    }

    var weatherRowState3 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow3 = updateTransition(targetState = weatherRowState3)
    val rowHeightAnim3 by transitionRow3.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 300.dp
            WeatherRowState.Large -> 400.dp
        }
    }

    var weatherRowState4 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow4 = updateTransition(targetState = weatherRowState4)
    val rowHeightAnim4 by transitionRow4.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 400.dp
            WeatherRowState.Large -> 500.dp
        }
    }

    var weatherRowState5 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow5 = updateTransition(targetState = weatherRowState5)
    val rowHeightAnim5 by transitionRow5.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 500.dp
            WeatherRowState.Large -> 600.dp
        }
    }

    var weatherRowState6 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow6 = updateTransition(targetState = weatherRowState6)
    val rowHeightAnim6 by transitionRow6.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 600.dp
            WeatherRowState.Large -> 700.dp
        }
    }

    var weatherRowState7 by remember { mutableStateOf(WeatherRowState.Small) }
    val transitionRow7 = updateTransition(targetState = weatherRowState7)
    val rowHeightAnim7 by transitionRow7.animateDp(
        transitionSpec = {
            tween(
                durationMillis = 500,
                easing = LinearOutSlowInEasing
            )
        }
    ) { state ->
        when (state) {
            WeatherRowState.Small -> 700.dp
            WeatherRowState.Large -> 800.dp
        }
    }

    val initialIconState = false
    var visibleWeatherIcon1 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon2 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon3 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon4 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon5 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon6 by remember { mutableStateOf(initialIconState) }
    var visibleWeatherIcon7 by remember { mutableStateOf(initialIconState) }

    val colourBackground1 = brown100
    val colourBackground2 = brown200
    val colourBackground3 = brown300
    val colourBackground4 = brown400
    val colourBackground5 = brown100
    val colourBackground6 = brown200
    val colourBackground7 = brown300

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Box {
            Column(
                modifier = Modifier
                    .height(rowHeightAnim7)
                    .fillMaxWidth()
                    .background(colourBackground7)
                    .padding(
                        top = if (rowHeightAnim6 == 600.dp) {
                            600.dp
                        } else {
                            700.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 700.dp
                        weatherRowState7 = if (rowHeightAnim7 == rowSmallValue || rowHeightAnim6 == 700.dp
                        ) {
                            visibleWeatherIcon7 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon7 = false
                            WeatherRowState.Small
                        }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState2 = WeatherRowState.Small
                        weatherRowState3 = WeatherRowState.Small
                        weatherRowState4 = WeatherRowState.Small
                        weatherRowState5 = WeatherRowState.Small
                        weatherRowState6 = WeatherRowState.Small

                        visibleWeatherIcon1 = false
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon6 = false
                    },
                verticalArrangement = Arrangement.Top,
            ) {
                WeatherRow(weatherHours[6], visibleWeatherIcon7)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim6)
                    .fillMaxWidth()
                    .background(colourBackground6)
                    .padding(
                        top = if (rowHeightAnim5 == 500.dp) {
                            500.dp
                        } else {
                            600.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 600.dp
                        weatherRowState6 = if (rowHeightAnim6 == rowSmallValue || rowHeightAnim5 == 600.dp
                        ) {
                            visibleWeatherIcon6 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon6 = false
                            WeatherRowState.Small
                        }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState2 = WeatherRowState.Small
                        weatherRowState3 = WeatherRowState.Small
                        weatherRowState4 = WeatherRowState.Small
                        weatherRowState5 = WeatherRowState.Small
                        weatherRowState7 = if (rowHeightAnim6 == rowSmallValue || rowHeightAnim5 == 600.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon1 = false
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[5], visibleWeatherIcon6)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim5)
                    .fillMaxWidth()
                    .background(colourBackground5)
                    .padding(
                        top = if (rowHeightAnim4 == 400.dp) {
                            400.dp
                        } else {
                            500.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 500.dp
                        weatherRowState5 = if (rowHeightAnim5 == rowSmallValue || rowHeightAnim4 == 500.dp
                        ) {
                            visibleWeatherIcon5 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon5 = false
                            WeatherRowState.Small
                        }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState2 = WeatherRowState.Small
                        weatherRowState3 = WeatherRowState.Small
                        weatherRowState4 = WeatherRowState.Small
                        weatherRowState6 = if (rowHeightAnim5 == rowSmallValue || rowHeightAnim4 == 500.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState7 = if (rowHeightAnim5 == rowSmallValue || rowHeightAnim4 == 500.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon1 = false
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon6 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[4], visibleWeatherIcon5)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim4)
                    .fillMaxWidth()
                    .background(colourBackground4)
                    .padding(
                        top = if (rowHeightAnim3 == 300.dp) {
                            300.dp
                        } else {
                            400.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 400.dp
                        weatherRowState4 =
                            if (rowHeightAnim4 == rowSmallValue || rowHeightAnim3 == 400.dp) {
                                visibleWeatherIcon4 = true
                                WeatherRowState.Large
                            } else {
                                visibleWeatherIcon4 = false
                                WeatherRowState.Small
                            }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState2 = WeatherRowState.Small
                        weatherRowState3 = WeatherRowState.Small
                        weatherRowState5 = if (rowHeightAnim4 == rowSmallValue || rowHeightAnim3 == 400.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState6 = if (rowHeightAnim4 == rowSmallValue || rowHeightAnim3 == 400.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState7 = if (rowHeightAnim4 == rowSmallValue || rowHeightAnim3 == 400.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon1 = false
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon6 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[3], visibleWeatherIcon4)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim3)
                    .fillMaxWidth()
                    .background(colourBackground3)
                    .padding(
                        top = if (rowHeightAnim2 == 200.dp) {
                            200.dp
                        } else {
                            300.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 300.dp
                        weatherRowState3 = if (rowHeightAnim3 == rowSmallValue || rowHeightAnim2 == 300.dp) {
                            visibleWeatherIcon3 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon3 = false
                            WeatherRowState.Small
                        }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState2 = WeatherRowState.Small
                        weatherRowState4 = if (rowHeightAnim3 == rowSmallValue || rowHeightAnim2 == 300.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState5 = if (rowHeightAnim3 == rowSmallValue || rowHeightAnim2 == 300.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState6 = if (rowHeightAnim3 == rowSmallValue || rowHeightAnim2 == 300.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState7 = if (rowHeightAnim3 == rowSmallValue || rowHeightAnim2 == 300.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon1 = false
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon6 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[2], visibleWeatherIcon3)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim2)
                    .fillMaxWidth()
                    .background(colourBackground2)
                    .padding(
                        top = if (rowHeightAnim1 == 100.dp) {
                            100.dp
                        } else {
                            200.dp
                        }
                    )
                    .clickable {
                        val rowSmallValue = 200.dp
                        weatherRowState2 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            visibleWeatherIcon2 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon2 = false
                            WeatherRowState.Small
                        }
                        weatherRowState1 = WeatherRowState.Small
                        weatherRowState3 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState4 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState5 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState6 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState7 = if (rowHeightAnim2 == rowSmallValue || rowHeightAnim1 == 200.dp) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon1 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon6 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[1], visibleWeatherIcon2)
            }
            Column(
                modifier = Modifier
                    .height(rowHeightAnim1)
                    .fillMaxWidth()
                    .background(colourBackground1)
                    .clickable {
                        val rowSmallValue = 100.dp
                        weatherRowState1 = if (rowHeightAnim1 == rowSmallValue) {
                            visibleWeatherIcon1 = true
                            WeatherRowState.Large
                        } else {
                            visibleWeatherIcon1 = false
                            WeatherRowState.Small
                        }
                        weatherRowState2 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState3 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState4 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState5 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState6 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        weatherRowState7 = if (rowHeightAnim1 == rowSmallValue) {
                            WeatherRowState.Large
                        } else {
                            WeatherRowState.Small
                        }
                        visibleWeatherIcon2 = false
                        visibleWeatherIcon3 = false
                        visibleWeatherIcon4 = false
                        visibleWeatherIcon5 = false
                        visibleWeatherIcon6 = false
                        visibleWeatherIcon7 = false
                    },
                verticalArrangement = Arrangement.Top
            ) {
                WeatherRow(weatherHours[0], visibleWeatherIcon1)
            }
        }
    }
}

private enum class WeatherRowState {
    Small,
    Large
}
