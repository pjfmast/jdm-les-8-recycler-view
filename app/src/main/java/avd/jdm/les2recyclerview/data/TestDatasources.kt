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
    fun loadMovies(): List<MovieUiModel> {
        return listOf(
            MovieUiModel(
                "Les Olympiades, Paris 13e",
                2021,
                "tt7150060",
                "TV series",
                "https://m.media-amazon.com/images/I/51emksO0KXL._AC_.jpg"
            ),MovieUiModel(
                "Find me in Paris",
                2018,
                "tt7150060",
                "TV series",
                "https://m.media-amazon.com/images/I/81loQXu0WeL._AC_SY741_.jpg"
            ),
            MovieUiModel(
                "Mrs. Harris Goes to Paris",
                2022,
                "tt5151570",
                "movie",
                "https://m.media-amazon.com/images/I/71NBkEHEAvL.__AC_SX300_SY300_QL70_ML2_.jpg"
            ),
            MovieUiModel(
                "Midnight in Paris",
                2011,
                "tt1605783",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTM4NjY1MDQwMl5BMl5BanBnXkFtZTcwNTI3Njg3NA@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "From Paris with Love",
                2010,
                "tt1179034",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BODAwMDFjNjktMWY2Mi00MmVhLWI0MjYtNzg4OTI0NzA5YzBjXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, Texas",
                1984,
                "tt0087884",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BM2RjMmU3ZWItYzBlMy00ZmJkLWE5YzgtNTVkODdhOWM3NGZhXkEyXkFqcGdeQXVyNDA5Mjg5MjA@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, je t'aime",
                2006,
                "tt0401711",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTc1MDgwNDE4MF5BMl5BanBnXkFtZTcwMTQzMzc0MQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Emily in Paris",
                2020,
                "tt8962124",
                "series",
                "https://m.media-amazon.com/images/M/MV5BYTFjZjQzZDgtOWEyNy00YmY1LTgyYjQtMTBlODUxZTBiZWRkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "An American in Paris",
                1951,
                "tt0043278",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMzFkNGM0YTUtZjY5Ny00NzBkLWE1NTAtYzUxNjUyZmJlODMwL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "The 15:17 to Paris",
                2018,
                "tt6802308",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTY0NjUzNjYwOV5BMl5BanBnXkFtZTgwMzY1MDM0NDM@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "2 Days in Paris",
                2007,
                "tt0841044",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMjAyNTY3NTcyOF5BMl5BanBnXkFtZTcwMTcyMjM1MQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Un monstre à Paris",
                2001,
                "tt0961097",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTgxNTg3MTE1NF5BMl5BanBnXkFtZTcwODI4NzgzNw@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "An American Werewolf in Paris",
                1997,
                "tt0118604",
                "movie",
                "https://m.media-amazon.com/images/I/51fBtD9oP7L._AC_.jpg"
            ),      MovieUiModel(
                "Midnight in Paris",
                2011,
                "tt1605783",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTM4NjY1MDQwMl5BMl5BanBnXkFtZTcwNTI3Njg3NA@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "From Paris with Love",
                2010,
                "tt1179034",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BODAwMDFjNjktMWY2Mi00MmVhLWI0MjYtNzg4OTI0NzA5YzBjXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, Texas",
                1984,
                "tt0087884",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BM2RjMmU3ZWItYzBlMy00ZmJkLWE5YzgtNTVkODdhOWM3NGZhXkEyXkFqcGdeQXVyNDA5Mjg5MjA@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, je t'aime",
                2006,
                "tt0401711",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTc1MDgwNDE4MF5BMl5BanBnXkFtZTcwMTQzMzc0MQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Emily in Paris",
                2020,
                "tt8962124",
                "series",
                "https://m.media-amazon.com/images/M/MV5BYTFjZjQzZDgtOWEyNy00YmY1LTgyYjQtMTBlODUxZTBiZWRkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "An American in Paris2",
                1951,
                "tt0043278",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMzFkNGM0YTUtZjY5Ny00NzBkLWE1NTAtYzUxNjUyZmJlODMwL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "The 15:17 to Paris2",
                2018,
                "tt6802308",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTY0NjUzNjYwOV5BMl5BanBnXkFtZTgwMzY1MDM0NDM@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "2 Days in Paris2",
                2007,
                "tt0841044",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMjAyNTY3NTcyOF5BMl5BanBnXkFtZTcwMTcyMjM1MQ@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Un monstre à Paris2",
                2001,
                "tt0961097",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTgxNTg3MTE1NF5BMl5BanBnXkFtZTcwODI4NzgzNw@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "An American Werewolf in Paris2",
                1997,
                "tt0118604",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BOGU0ZmE5NzUtYWY0Yi00NDZjLWI4Y2UtZDdkNDFjMmNkM2MxXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Not found movie of Paris",
                2099,
                "ttxyz",
                "movie",
                "https://notaparismovie/images/noimage"
            ),

            )
    }
}