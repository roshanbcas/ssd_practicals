# solent SSD Public
Git Repository of java examples for Solent Students for BCC608 Software System Development and development.

## Contents
The repository contains a number of example projects, weekly exercises and an area for you to create and store your own work during the course 'myPracticeCourseWork'. 
Please read and follow the Getting Started instructions before doing anything else.

## Prerequisites
In order to complete these exercises you will need Java 8 or 11, Intellij Idea or 12, Tomcat, Maven and git installed on your machine. Seperate installation instructions have been provided if you dont have this software installed already.

[maven-setup](../master/maven-setup) DEPRICATED: This contains scripts to help you set the java class path and temporarily install maven on university machines which dont support maven. 
PLEASE NOTE that the university lab PC's should now have maven pre-installed so these steps in [maven-setup](../master/maven-setup) are not necessary on all machines. 

## Getting Started with GIT
Before doing anything else you will need to follow these getting started instructions.
This will teach you a little bit about git and how to fork a copy of this repository into your own github account.

You will then be able to clone your fork locally and then follow the instructions in the [maven-setup](../master/session1/maven-setup) project to get javac and maven working. 
After this you can then proceed to doing the exercises in [session1](../master/session1/).

### Introduction to GIT
To be a professional developer, you will need to become proficient at using version control systems.
Many version control systems (each with their own benefits and drawbacks e.g CVS, Subversion, git) have been popular over the years. 
Presently one of the most popular, git, was developed by Linus Torvalds to help with the collaborative development of the Linux Kernel.

In recent years many open source projects have migrated their code base to github (https://github.com) which supports a collaborative workflow for team development and sharing of source code using git. 

The principle advantage of git over other version control systems is that it is completely distributed. When you use git you clone a complete local copy of the repository you are cloning (usually referred to as the origin). You can develop code and save your changes in your local repository completely off line. At a later stage you may wish to push your changes to the on line repository or pull changes others have made into your local copy. 

There are many on line tutorials on using git and it will be worth while spending some time on these to get proficient. e.g.
* https://try.github.io/ Resources to learn Git
* https://guides.github.com/introduction/git-handbook/ Git Handbook 
* https://learngitbranching.js.org/ provides a very useful interactive tutorial on branching and merging.

Using git successfully with a team can be complex but fortunately you only need to master a few commands to work on your own project
```
git clone  (a command to clone your local copy of the on line repository)
git status (a command to tell you what is the state of your local repository e.g are their any changes to commit and push)
git pull  (a command to pull the latest changes from the remote repository into your local copy)
git add --all (a command to stage all of the current changes ready for a commit)
git commit -m 'my commit message' (a command to commit changes to your local repository)
git push (a command to push your latest commits up to the remote repository)
```

### IMPORTANT GitHub Security
Github no longer accepts a simple username and password for accessing accounts. 
Please see the page on [Github Security](../master/githubsecurity.md) to see how to set up certificates to access your github account from the university machines.



