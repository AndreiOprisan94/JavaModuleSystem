#!/bin/bash
set -e
source ../executables.sh

echo "--- COMPILATION & PACKAGING ---"

echo " > creating clean directories"
rm -rf classes
mkdir classes
rm -rf jars
mkdir jars

echo " > compiling monitor"
$JAVAC --module-path libs -d classes src/main/java/monitor/observer/beta/BetaServiceObserver.java src/main/java/monitor/observer/DiagnosticDataPoint.java src/main/java/monitor/observer/alpha/AlphaServiceObserver.java src/main/java/monitor/observer/ServiceObserver.java src/main/java/monitor/Monitor.java src/main/java/monitor/persistence/StatisticsRepository.java src/main/java/monitor/statistics/Statistics.java src/main/java/monitor/statistics/Statistician.java src/main/java/monitor/Main.java src/main/java/monitor/rest/MonitorServer.java src/main/java/module-info.java

echo " > packaging monitor"
$JAR --create --file jars/monitor.jar -C classes .

echo " > running monitor"
$JAVA --module-path libs:jars --module monitor/monitor.Main