#!/bin/bash
set -e
source ../executables.sh

echo " > running monitor"
$JAVA --module-path libs:jars --add-modules monitor.observer.alpha --add-modules monitor.observer.beta --module monitor/monitor.Main