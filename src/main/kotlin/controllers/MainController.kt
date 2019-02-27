
import io.datafx.controller.flow.context.ViewFlowContext
import javax.annotation.PostConstruct
import io.datafx.controller.flow.context.FXMLViewFlowContext
import io.datafx.controller.ViewController

@ViewController(value = "fxml/Main.fxml", title = "Orientador vocacional")
open class MainController {

    @FXMLViewFlowContext
    private var context: ViewFlowContext? = null


    /**
     * init fxml when loaded.
     */
    @PostConstruct
    @Throws(Exception::class)
    fun init() {

    }


}