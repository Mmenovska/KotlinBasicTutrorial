package com.android.gsixacademy.kotlinbasictutrorial.company

import com.android.gsixacademy.kotlinbasictutrorial.models.CompanyResult

sealed class CompanyAdapterClickEvent {
    data class CompanyAdapterItemClicked (var companyResult : CompanyResult) : CompanyAdapterClickEvent()
}