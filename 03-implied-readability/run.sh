#!/bin/bash
set -e
source ../executables.sh

echo " > running monitor"
$JAVA --module-path libs:jars --module monitor/monitor.Main