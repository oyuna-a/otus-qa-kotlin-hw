import kotlin.reflect.full.declaredFunctions

class TestRunnerImpl : TestRunner {
    override fun <T: Any> runTest(steps: T, test: () -> Unit) {
        val functions = steps::class.declaredFunctions
        val beforeMethods = functions.filter { it.name.startsWith("before") }
        val afterMethods = functions.filter { it.name.startsWith("after") }

        beforeMethods.forEach {
            println("Run ${it.name}")
        }
        test()
        afterMethods.forEach {
            println("Run ${it.name}")
        }
    }
}