// vars/buildApp.groovy
def call(Map config = [:]) {
    stage('Build') {
        def profile = config.profile ?: 'dev'
        echo "Building the application with profile: ${profile}"
       
    }
}
