package tci.multiJob;

import tci.multiJob.phaseJob

class phase implements Serializable {

    def script
    def jobs = []
    def job1
    def job2

    phase(script) {
        this.script = script

        job1 = phaseJob.newInstance(script,"test-tciEnv")
        jobs << job1

    }

    void addJob(Map config) {
        if (config.jobName == null) {
            throw ("[ERROR] You must provide a jobName!")
        }

        def job = phaseJob.newInstance(script,config.jobName)
        jobs << job
    }

    void run() {
        script.timestamps() {
            def parallelBlocks = [:]
            def counter=1

            jobs.each {
                parallelBlocks[it.jobName+':'+counter] = {
                script.stage(it.jobName+':'+counter) {
                    script.build job: it.jobName, wait: true
                    }
                }
                counter++
            }
            script.parallel parallelBlocks
        }
    }

}

