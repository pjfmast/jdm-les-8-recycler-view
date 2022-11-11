package avd.jdm.les2recyclerview.data

import avd.jdm.les2recyclerview.model.*


class TestDatasources {
    fun loadCats(): List<CatUiModel> {
        return listOf(
            CatUiModel(
                Gender.Male,
                CatBreed.BalineseJavanese,
                "Fred",
                "Silent and deadly",
                "https://cdn2.thecatapi.com/images/DBmIBhhyv.jpg"
            ),
            CatUiModel(
                Gender.Female,
                CatBreed.ExoticShorthair,
                "Wilma",
                "Cuddly assassin",
                "https://cdn2.thecatapi.com/images/KJF8fB_20.jpg"
            ),
            CatUiModel(
                Gender.Unknown,
                CatBreed.AmericanCurl,
                "Curious George",
                "Award winning investigator",
                "https://cdn2.thecatapi.com/images/vJB8rwfdX.jpg"
            )
        )
    }
    fun loadEmployees(): List<EmployeeUiModel> {
        return listOf(
            EmployeeUiModel(
                "Robert",
                "Rose quickly through the organization",
                EmployeeRole.Management,
                Gender.Male,
                "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"
            ),
            EmployeeUiModel(
                "Wilma",
                "A talented developer",
                EmployeeRole.Technology,
                Gender.Female,
                "https://images.pexels.com/photos/3189024/pexels-photo-3189024.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"
            ),
            EmployeeUiModel(
                "Curious George",
                "Excellent at retention",
                EmployeeRole.HumanResources,
                Gender.Unknown,
                "https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
            )
        )
    }
}