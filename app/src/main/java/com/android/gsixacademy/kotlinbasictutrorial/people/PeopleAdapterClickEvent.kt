package com.android.gsixacademy.kotlinbasictutrorial.people

import com.android.gsixacademy.kotlinbasictutrorial.models.PersonResult
import com.android.gsixacademy.kotlinbasictutrorial.movies.MoviesAdapterClickEvent

sealed class PeopleAdapterClickEvent {
    data class PeopleAdapterItemClicked (var peopleResult : PersonResult) : PeopleAdapterClickEvent()
}