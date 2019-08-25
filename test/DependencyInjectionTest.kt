import consumers.DepInjectApp
import consumers.IMediaProcess
import injectors.IMediaProcessInjector
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import services.IShowingService

class DependencyInjectionTest {

    private var mediaProcessInjector: IMediaProcessInjector? = null

    @Before
    fun setUp() {
        mediaProcessInjector = object : IMediaProcessInjector {
            override fun getMediaProcess(): IMediaProcess = DepInjectApp(object : IShowingService {
                override fun showTime(showId: String) {
                    print("$showId Show Time Implemented")
                }
            })
        }
    }

    @Test
    fun testMediaProcessConsumer() {
        val mediaProcess = mediaProcessInjector?.getMediaProcess()
        assertNotNull(mediaProcess)
        mediaProcess?.processMedia("Sillicon Valley")
    }

    @After
    fun tearDown() {
        mediaProcessInjector = null
    }
}