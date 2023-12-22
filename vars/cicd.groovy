def gitDownload(repo)
{
  git "https://github.com/majjilavanya/${repo}.git"
}
def mavenBuild()
{
  sh 'mvn package'
}






