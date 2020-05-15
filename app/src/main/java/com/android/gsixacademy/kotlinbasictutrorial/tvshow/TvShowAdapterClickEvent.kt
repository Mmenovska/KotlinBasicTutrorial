package com.android.gsixacademy.kotlinbasictutrorial.tvshow

import com.android.gsixacademy.kotlinbasictutrorial.models.PopularTv

sealed class TvShowAdapterClickEvent {
    data class TvShowAdapterItemClicked (var tvShowResult : PopularTv) : TvShowAdapterClickEvent()
}