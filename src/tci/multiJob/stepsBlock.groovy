package tci.multiJob;

class stepsBlock implements Serializable {

    def script
    def step1
    def step2
    def step3

    stepsBlock(script) {
        this.script = script

        step1 = new script.step("echo test1")
        step2 = "echo test2"
        step3 = "echo test3"
    }

}

