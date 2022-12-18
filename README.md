# scala-web-bloop-sbt-spring-thyme-multi-node-zookeeper-solr-simple

## Description
A thyme springboot scala bloop-sbt build,
that connects to solr database cluster.

To create the `dog` collection we use a runner
to remotely issue `solr create_collection -c` to
node 1.

Zookeeper is used for replication across
the cluster.

Compiled and ran from build server `bloop`.

# Build note
Dependencies must be compatable with jdk8 or less.

## Tech stack
- bloop
- springboot
  - thymeleaf
- bloop-sbt
  - solr drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable
- zookeeper

## Docker stack
- solr:8.2
- zookeeper:3.5
- hseeberger/scala-bloop-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Node 1 solr webui](http://localhost:8981)
- [Node 2 solr webui](http://localhost:8982)
- [Node 3 solr webui](http://localhost:8983)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung code](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-solr)
- [Springboot code](https://scaladeveloperzone.com/spring-boot/spring-boot-solr-example/)
- [Spring data config](https://www.google.com/search?client=firefox-b-1-lm&q=spring+boot+solr+example)
- [Cluster setup](https://gist.github.com/makuk66/0812f70b77aa92230c203cec41acac64#file-docker-compose-yml-L64)
- [Example solr queries](https://docs.spring.io/spring-data/solr/docs/1.0.x/reference/html/solr.repositories.html)
