package services

class CinemaService : IShowingService {

    override fun showTime(showId: String) {
        println("$showId is currently playing in the cinemas")
    }

}