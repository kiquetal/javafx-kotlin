import com.jfoenix.controls.JFXDecorator
import io.datafx.controller.flow.Flow
import io.datafx.controller.flow.container.DefaultFlowContainer
import io.datafx.controller.flow.context.ViewFlowContext
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import io.datafx.controller.flow.context.FXMLViewFlowContext

/*
    Only one application per javafx project
    @author kiquetal@gmail.com 

 */


class App: Application()
{

    @FXMLViewFlowContext
    private  var flowContext: ViewFlowContext? = null
    override fun start(primaryStage: Stage?) {


        val flow= Flow(MainController::class.java)
        val container=DefaultFlowContainer()
        flowContext= ViewFlowContext()
        flowContext!!.register("Stage",primaryStage)
        System.out.println("${flow.toString()} es el flujo")
        flow.createHandler(flowContext!!).start(container)

        val decorator=JFXDecorator(primaryStage,container.view,true,true,true)
        decorator.isCustomMaximize=true

        val scene=Scene(decorator,400.0,400.0)
        primaryStage?.title="Probando el controller"

        val stylesheets = scene.stylesheets
        stylesheets.addAll(
            App::class.java!!.getResource( "./css/jfoenix-components.css").toExternalForm(),
            App::class.java!!.getResource("./css/jfoenix-main-demo.css").toExternalForm()
        )

        primaryStage?.scene=scene
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