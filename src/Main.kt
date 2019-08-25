import consumers.IMediaProcess
import injectors.CinemaServiceInjector
import injectors.IMediaProcessInjector
import injectors.TvServiceInjector

fun main() {

    val showId = "Rick and Morty"

    var mediaProcessInjector: IMediaProcessInjector
    var mediaProcess: IMediaProcess

    //Cinema
    mediaProcessInjector = CinemaServiceInjector()
    mediaProcess = mediaProcessInjector.getMediaProcess()
    mediaProcess.processMedia(showId)

    //Tv
    mediaProcessInjector = TvServiceInjector()
    mediaProcess = mediaProcessInjector.getMediaProcess()
    mediaProcess.processMedia(showId)


}