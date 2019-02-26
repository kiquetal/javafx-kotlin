import com.jfoenix.controls.JFXDecorator
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class App: Application()
{
    override fun start(primaryStage: Stage?) {

        val panel= Pane()
        val scene= Scene(panel,200.0,200.0)

        val scene2=JFXDecorator(primaryStage,panel,true,true,true)
        primaryStage?.title="Learning Koltin with javaFx"
        primaryStage?.scene=Scene(scene2,400.0,400.0)
        primaryStage?.show()
    }
    companion object {
        @JvmStatic
        public fun main (args:Array<String>)
        {
            launch(App::class.java)
        }
    }

}