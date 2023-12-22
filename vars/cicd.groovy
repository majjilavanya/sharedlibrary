def gitDownload(repo)
{
  git "https://github.com/majjilavanya/${repo}.git"
}
def mavenBuild()
{
  sh 'mvn package'
}
def deployTomcat(jobname,ip,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}mcat9/webapps/${context}.war"
}






