package injectors

import consumers.IMediaProcess

interface IMediaProcessInjector {

    fun getMediaProcess(): IMediaProcess

}