#!/bin/bash
set -e
source ../executables.sh

echo "--- COMPILATION & PACKAGING ---"

echo "Building module $1"

MODULE_NAME=$1

echo " > compiling $MODULE_NAME"
#$JAVAC --module-path libs --module-source-path "./*/src/main/java" -d classes --module monitor
$JAVAC --module-source-path './*/src/main/java/' --module-path libs:jars -d classes --module $MODULE_NAME

JAR_CHANGE_DIR=classes/$MODULE_NAME/
JAR_RELATIVE_PATH_TO_BUILD=.

echo " > packaging $MODULE_NAME"
$JAR --create --file jars/${MODULE_NAME}.jar -C $JAR_CHANGE_DIR $JAR_RELATIVE_PATH_TO_BUILD

