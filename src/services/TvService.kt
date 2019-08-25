package services

class TvService : IShowingService {

    override fun showTime(showId: String) {
        println("$showId is showing on Tv")
    }

}