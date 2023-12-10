class TestSteps {
    fun beforeAll() {
        println("Run before all")
    }

    fun beforeMethod() {
        println("Run before method")
    }

    fun afterAll() {
        println("Run after all")
    }

    fun afterMethod() {
        println("Run after method")
    }
}