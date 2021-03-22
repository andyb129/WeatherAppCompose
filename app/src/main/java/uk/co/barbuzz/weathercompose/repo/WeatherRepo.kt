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
package uk.co.barbuzz.weathercompose.repo

import uk.co.barbuzz.weathercompose.R
import uk.co.barbuzz.weathercompose.model.WeatherHour

class WeatherRepo {

    fun getWeatherForToday() =
        listOf(
            WeatherHour("13:00", "10˚", "Sunny", "Wind 7 mph", R.drawable.ic_sun),
            WeatherHour("14:00", "6˚", "Cloudy", "Wind 2 mph", R.drawable.ic_cloudy),
            WeatherHour("15:00", "12˚", "Rain", "Wind 10 mph", R.drawable.ic_rain),
            WeatherHour("16:00", "10˚", "Rain", "Wind 5 mph", R.drawable.ic_rain),
            WeatherHour("17:00", "15˚", "Sunny", "Wind 2 mph", R.drawable.ic_sun),
            WeatherHour("18:00", "7˚", "Sunny", "Wind 1 mph", R.drawable.ic_sun),
            WeatherHour("19:00", "-2˚", "Snow", "Wind 4 mph", R.drawable.ic_snow)
        )
}
