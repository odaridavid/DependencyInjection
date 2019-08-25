package injectors

import consumers.DepInjectApp
import consumers.IMediaProcess
import services.TvService

class TvServiceInjector :IMediaProcessInjector{

    override fun getMediaProcess(): IMediaProcess  = DepInjectApp(TvService())

}