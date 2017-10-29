# TPL - Tikal Pipeline Library
![tikal-pipelib](src/resources/images/TPL-small.png)

### ***Tikal Jenkins Pipeline Library***.

Powered by **[Tikal Knowledge](http://www.tikalk.com)** and the community.
<hr/>

**tikal-pipelib** is a [shared library](https://jenkins.io/doc/book/pipeline/shared-libraries/) for [Jenkins Pipeline](https://jenkins.io/doc/book/pipeline/).

The Library is a collection of tasks and advanced flows that can be used inside a pipeline.

Anyone who wants to contribute to this library - please follow the instructions below in the page.

## [Available tasks](vars/README.md)

* tpl_advancedSlackNotification
* tpl_echo
* tpl_getBuildUserId
* tpl_setStatusByLogText

## [Available flows](src/tpl/ci)

* [tpl_BaseCiPipeline](src/tpl/ci/tpl_BaseCiPipeline.groovy)
  * [tpl_GradleCiPipeline](src/tpl/ci/gradle/tpl_GradleCiPipeline.groovy)
  * [tpl_ArtifactoryCiPipeline](src/tpl/ci/maven/tpl_ArtifactoryCiPipeline.groovy)

## Adding an item to tikal-pipelib

For adding a new task, please follow those steps.

1. Create a branch or a fork from the master branch.
2. Write the groovy file for the task in the [/vars](/vars) folder - the file name **MUST** start with **tpl_** prefix.
4. Write a markdown section for describing the added task in [/vars/README.md](/vars/README.md) file.
5. commit and push your branch.
6. Submit a pull request.

Please notice that only the following of these instructions will be accepted.

Tikal reserve the right to accept or reject pull requests.