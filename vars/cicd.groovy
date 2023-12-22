def gitDownload(repo)
{
  git "https://github.com/majjilavanya/${repo}.git"
}
def mavenBuild()
{
  sh 'mvn package'
}
def deployTomcat(job name,ip,context path)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}mcat9/webapps/${context}.war"
}






