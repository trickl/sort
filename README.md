# Trickl Sort
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.trickl/sort/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.trickl/sort)
[![build_status](https://travis-ci.com/trickl/sort.svg?branch=master)](https://travis-ci.com/trickl/sort)
[![Maintainability](https://api.codeclimate.com/v1/badges/c50441e8e5e10b31803f/maintainability)](https://codeclimate.com/github/trickl/sort/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/c50441e8e5e10b31803f/test_coverage)](https://codeclimate.com/github/trickl/sort/test_coverage)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Specialised sorting and selection algorithms - 

* Efficient four and five element sort
* Median of medians selection.
* Ability to use a specialized permutator in sorting algorithms.
  e.g. - A paired permutator, which allows users to efficiently simultaneously sort an array and generate the sort rank at the same time.

Installation
============

To install from Maven Central:

```xml
<dependency>
  <groupId>com.github.trickl</groupId>
  <artifactId>sort</artifactId>
  <version>0.1.1</version>
</dependency>
```

## Usage

See the Junit tests for usage

### Building

To download the library into a folder called "sort" run

```
git clone https://github.com/trickl/sort.git
```

To build the library run

```
mvn clean build
```
