@echo off
set /p clname=className?
cls
javac -encoding utf8 %clname%.java
java %clname%
del %clname%.class
