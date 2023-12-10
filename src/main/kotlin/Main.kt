fun main(args: Array<String>) {

    TestRunnerImpl().runTest(TestSteps()) { someTest() }
}

fun someTest() {
    println("Run some test")
}