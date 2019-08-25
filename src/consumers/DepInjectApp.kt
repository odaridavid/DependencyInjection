package consumers

import services.IShowingService

class DepInjectApp(private var mediaService: IShowingService) : IMediaProcess {

    override fun processMedia(showId: String) {
        mediaService.showTime(showId)
    }

}