@rem     *****************************************************************************
@rem     this script starts the Derby ij and creates the database
@rem     *****************************************************************************

@rem     change the following line to 'echo on' for debugging
@echo off

setlocal

@rem     call dbSetenv.cmd script to set up the Derby environment
@rem     *************************************************
@rem     this script sets up the environment for Derby
@rem     *************************************************

@echo off

@rem This environment variable names the databse
set DB_NAME=jdbc:derby://localhost:1527/rpsdb

@rem This environment variable points to the Derby install directory
set DERBY_INSTALL=../DerbyLib

@rem We use the following in dbStart.cmd to deal with Java 7 security issues
set DERBY_PORT=1527

set CLASSPATH=.;%DERBY_INSTALL%\derby.jar;%DERBY_INSTALL%\derbytools.jar;%DERBY_INSTALL%\derbynet.jar;%DERBY_INSTALL%\derbyclient.jar;%CLASSPATH%

title Create RPSDB database

@rem     start ij, and run the the dbCreate.sql script, which connects 
@rem     to the database, as user/password guest/password,
@rem     creates the database if it doesn't exist,
@rem     and creates the schema and database tables
java -Dij.driver=org.apache.derby.jdbc.ClientDriver -Dij.database=%DB_NAME%;create=true -Dij.user=guest -Dij.password=password org.apache.derby.tools.ij rpsdbCreate.sql


echo RPSDB created.
pause

endlocal
