pipelineJob('buildJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Apri34/spring-boot-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}