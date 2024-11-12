// vars/testApp.groovy
def call(Map config = [:]) {
    stage('Test') {
        def profile = config.profile ?: 'dev'
        echo "Testing the application with profile: ${profile}"
        sh "mvn test -P${profile}"
    }
}
