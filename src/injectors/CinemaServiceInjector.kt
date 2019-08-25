package injectors

import consumers.DepInjectApp
import consumers.IMediaProcess
import services.CinemaService

class CinemaServiceInjector : IMediaProcessInjector {

    override fun getMediaProcess(): IMediaProcess = DepInjectApp(CinemaService())
}