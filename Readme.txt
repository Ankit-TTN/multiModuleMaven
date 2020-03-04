Q5: Explain different tags (plugins, dependency, parent, profile, properties, modules and project related
    (i.e. modelVersion, groupId, artifactId, packaging, version, description)) of POM file
    created using archetype.

Ans: Plugins -
     Dependency - It is used to manage dependency in Maven
     Patrent - Used for Defining Parent Pom
     Profile - Used for defining Configs for test,deployment etc
     Properties -
     Modules - Sub Projects in a Project
     Model version - (For Maven 2,3 it is 4.0.0) Defines the model version
     GroupId - This is an Id of project's group. This is generally unique amongst an organization or a project.
     ArtifactId - This is an Id of the project. This is generally name of the project.  Along with the groupId, the artifactId defines the artifact's location within the repository.
     Packaging -
     Version - This is the version of the project. Along with the groupId, It is used within This is the version of the project. Along with the groupId, It is used within an artifact's repository to separate versions from each otheran artifact's repository to separate versions from each other (com.company.bank:consumer-banking:1.0)
     Description - Description of the project

Q6: Point out the differences between Gradle and Maven.
Ans: Maven:
        - Uses Xml
        - Less Flexible than Gradle

     Gradle:
        - Uses groovy
        - Based on Ant and Maven
        - Written in Java and Kotlin
        - Flexible

Q7: What is the purpose of mvn clean install and its usage in the project.
Ans: mvn install will:
     - Generate whatever it needs,
     - Compile the sources,
     - Create the artifact for your project,
     - Run unit tests,
     - Copy the artifact to the local Mvn repository

     Mvn clean install will first clean the target and then run the steps above.


