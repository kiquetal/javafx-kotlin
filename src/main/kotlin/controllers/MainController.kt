
import io.datafx.controller.flow.context.ViewFlowContext
import javax.annotation.PostConstruct
import io.datafx.controller.flow.context.FXMLViewFlowContext
import io.datafx.controller.ViewController

/*
@author: kiquetal@gmail.com
2019-02-26T23:54:34.651Z
 */
@ViewController(value = "fxml/Main.fxml",title = "Aprendiendo jfoenix with kotlin")
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